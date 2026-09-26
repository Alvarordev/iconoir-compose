// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/emoji-ball.svg. Do not edit.
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

public val Iconoir.Regular.EmojiBall: ImageVector
    get() = emojiballVector.value

private object emojiballVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/emoji-ball", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(10f, 9f),
                PathNode.HorizontalTo(8f),
                PathNode.MoveTo(16f, 9f),
                PathNode.HorizontalTo(14f),
                PathNode.MoveTo(18f, 15f),
                PathNode.HorizontalTo(6f),
                PathNode.MoveTo(2f, 12f),
                PathNode.CurveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f),
                PathNode.CurveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f),
                PathNode.CurveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f),
                PathNode.CurveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f),
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
        }.build()
    }
}
