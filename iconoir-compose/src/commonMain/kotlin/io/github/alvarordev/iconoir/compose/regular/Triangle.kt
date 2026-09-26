// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/triangle.svg. Do not edit.
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

public val Iconoir.Regular.Triangle: ImageVector
    get() = triangleVector.value

private object triangleVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/triangle", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(11.4752f, 2.94682f),
                PathNode.CurveTo(11.7037f, 2.53464f, 12.2963f, 2.53464f, 12.5248f, 2.94682f),
                PathNode.LineTo(21.8985f, 19.8591f),
                PathNode.CurveTo(22.1202f, 20.259f, 21.831f, 20.75f, 21.3738f, 20.75f),
                PathNode.HorizontalTo(2.62625f),
                PathNode.CurveTo(2.16902f, 20.75f, 1.87981f, 20.259f, 2.10146f, 19.8591f),
                PathNode.LineTo(11.4752f, 2.94682f),
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
