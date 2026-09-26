// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/comp-align-right.svg. Do not edit.
package io.github.alvarordev.iconoir.compose.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir

public val Iconoir.Solid.CompAlignRight: ImageVector
    get() = compalignrightVector.value

private object compalignrightVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/comp-align-right", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(21f, 22f),
                PathNode.VerticalTo(2f),
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
                PathNode.MoveTo(15f, 16f),
                PathNode.HorizontalTo(5f),
                PathNode.CurveTo(3.89543f, 16f, 3f, 15.1046f, 3f, 14f),
                PathNode.LineTo(3f, 10f),
                PathNode.CurveTo(3f, 8.89543f, 3.89543f, 8f, 5f, 8f),
                PathNode.HorizontalTo(15f),
                PathNode.CurveTo(16.1046f, 8f, 17f, 8.89543f, 17f, 10f),
                PathNode.VerticalTo(14f),
                PathNode.CurveTo(17f, 15.1046f, 16.1046f, 16f, 15f, 16f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
