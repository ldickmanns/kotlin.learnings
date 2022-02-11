package learnings.kotlin.deepLearnings

import org.jetbrains.kotlinx.dl.api.core.Sequential
import org.jetbrains.kotlinx.dl.api.core.activation.Activations
import org.jetbrains.kotlinx.dl.api.core.layer.core.Dense
import org.jetbrains.kotlinx.dl.api.core.layer.core.Input
import org.jetbrains.kotlinx.dl.api.core.layer.reshaping.Flatten
import org.jetbrains.kotlinx.dl.api.core.loss.Losses
import org.jetbrains.kotlinx.dl.api.core.metric.Metrics
import org.jetbrains.kotlinx.dl.api.core.optimizer.Adam
import org.jetbrains.kotlinx.dl.api.core.summary.logSummary
import org.jetbrains.kotlinx.dl.dataset.mnist

/**********************************
 * Kotlin Learnings               *
 **********************************
 * Fully-connected Neural Network *
 **********************************/

fun main() {
    /** Destructuring declaration. */
    val (trainSet, testSet) = mnist()
    /** Sequential model with two hidden layers. */
    val model = Sequential.of(
        Input(28, 28, 1),
        Flatten(),
        Dense(256),
        Dense(128),
        Dense(10, activation = Activations.Softmax)
    )

    model.use {
        /** Optimizer, loss function, and metric. */
        it.compile(
            Adam(),
            Losses.SOFT_MAX_CROSS_ENTROPY_WITH_LOGITS,
            Metrics.ACCURACY
        )
        /** Model summary. */
        it.logSummary()
        /** Training the model. */
        it.fit(trainSet, 50, 1024)
        /** Testing the model on unseen data. */
        val result = model.evaluate(testSet)
        println("Loss: ${result.lossValue}")
        println("Acc:  ${result.metrics[Metrics.ACCURACY]}")
    }
}
