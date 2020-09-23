package utils

import javafx.application.Application
import javafx.application.Platform
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import javafx.stage.FileChooser
import javafx.stage.Stage
import java.io.File

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    Application.launch(FileRenamer::class.java)
}

class FileRenamer : Application() {
    private val label = Label("Enter the new file name (without suffix)")
    private val textField = TextField()
    private val button = Button("Apply")
    private val vBox = VBox(label, textField, button)
    private val files: List<File>

    init {
        initButton()
        vBox.alignment = Pos.CENTER
        files = initFiles()
    }

    override fun start(primaryStage: Stage) {
        primaryStage.title = "File Renamer"
        primaryStage.scene = Scene(vBox)
        primaryStage.show()
    }

    private fun initButton() {
        button.setOnAction {
            files.forEach { renameFileNameWithoutSuffix(it, textField.text) }
            Platform.exit()
        }
    }

    private fun initFiles(): List<File> {
        val file = File("/home/ludwig/documents/02_Business/01_Influencer/IG_KL/pics/000-099_KL")
        val fileChooser = FileChooser()
        fileChooser.initialDirectory = file
        fileChooser.title = "Select files to be renamed"
        return fileChooser.showOpenMultipleDialog(null)
    }
}

private fun renameFileNameWithoutSuffix(file: File, newNameWithoutSuffix: String) {
    val suffix = "_" + file.name.substringAfterLast("_")
    val newName = newNameWithoutSuffix + suffix
    val newFile = File(file.parent, newName)
    file.renameTo(newFile)
}

