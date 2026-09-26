// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/input-field.svg. Do not edit.
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

public val Iconoir.Regular.InputField: ImageVector
    get() = inputfieldVector.value

private object inputfieldVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/input-field", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(4f, 6f),
                PathNode.HorizontalTo(20f),
                PathNode.CurveTo(21.1046f, 6f, 22f, 6.89543f, 22f, 8f),
                PathNode.VerticalTo(16f),
                PathNode.CurveTo(22f, 17.1046f, 21.1046f, 18f, 20f, 18f),
                PathNode.HorizontalTo(4f),
                PathNode.CurveTo(2.89543f, 18f, 2f, 17.1046f, 2f, 16f),
                PathNode.VerticalTo(8f),
                PathNode.CurveTo(2f, 6.89543f, 2.89543f, 6f, 4f, 6f),
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
                PathNode.MoveTo(5f, 8.5f),
                PathNode.HorizontalTo(6.5f),
                PathNode.MoveTo(8f, 8.5f),
                PathNode.HorizontalTo(6.5f),
                PathNode.MoveTo(6.5f, 8.5f),
                PathNode.VerticalTo(15.5f),
                PathNode.MoveTo(6.5f, 15.5f),
                PathNode.HorizontalTo(5f),
                PathNode.MoveTo(6.5f, 15.5f),
                PathNode.HorizontalTo(8f),
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
