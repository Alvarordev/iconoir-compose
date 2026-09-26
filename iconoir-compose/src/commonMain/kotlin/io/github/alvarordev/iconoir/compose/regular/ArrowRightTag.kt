// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/arrow-right-tag.svg. Do not edit.
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

public val Iconoir.Regular.ArrowRightTag: ImageVector
    get() = arrowrighttagVector.value

private object arrowrighttagVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/arrow-right-tag", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(6.75f, 12f),
                PathNode.HorizontalTo(16.75f),
                PathNode.MoveTo(16.75f, 12f),
                PathNode.LineTo(14f, 14.75f),
                PathNode.MoveTo(16.75f, 12f),
                PathNode.LineTo(14f, 9.25f),
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
                PathNode.MoveTo(2f, 15f),
                PathNode.VerticalTo(9f),
                PathNode.CurveTo(2f, 6.79086f, 3.79086f, 5f, 6f, 5f),
                PathNode.HorizontalTo(18f),
                PathNode.CurveTo(20.2091f, 5f, 22f, 6.79086f, 22f, 9f),
                PathNode.VerticalTo(15f),
                PathNode.CurveTo(22f, 17.2091f, 20.2091f, 19f, 18f, 19f),
                PathNode.HorizontalTo(6f),
                PathNode.CurveTo(3.79086f, 19f, 2f, 17.2091f, 2f, 15f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
