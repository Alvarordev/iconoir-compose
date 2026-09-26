// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/single-tap-gesture.svg. Do not edit.
package io.github.alvarordev.iconoir.compose.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir

public val Iconoir.Regular.SingleTapGesture: ImageVector
    get() = singletapgestureVector.value

private object singletapgestureVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/single-tap-gesture", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 20.5f),
                PathNode.CurveTo(15.866f, 20.5f, 19f, 17.366f, 19f, 13.5f),
                PathNode.CurveTo(19f, 9.63401f, 15.866f, 6.5f, 12f, 6.5f),
                PathNode.CurveTo(8.13401f, 6.5f, 5f, 9.63401f, 5f, 13.5f),
                PathNode.CurveTo(5f, 17.366f, 8.13401f, 20.5f, 12f, 20.5f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        addPath(
            pathData = listOf(
                PathNode.MoveTo(4f, 7.28995f),
                PathNode.CurveTo(5.49623f, 5.03879f, 8.51707f, 3.5f, 12f, 3.5f),
                PathNode.CurveTo(15.4829f, 3.5f, 18.5038f, 5.03879f, 20f, 7.28995f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
