// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/bag.svg. Do not edit.
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

public val Iconoir.Regular.Bag: ImageVector
    get() = bagVector.value

private object bagVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/bag", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(4.50828f, 20f),
                PathNode.HorizontalTo(19.4917f),
                PathNode.CurveTo(19.785f, 20f, 20.0353f, 19.788f, 20.0836f, 19.4986f),
                PathNode.LineTo(21.8836f, 8.69864f),
                PathNode.CurveTo(21.9445f, 8.33292f, 21.6625f, 8f, 21.2917f, 8f),
                PathNode.HorizontalTo(2.70828f),
                PathNode.CurveTo(2.33751f, 8f, 2.05549f, 8.33292f, 2.11644f, 8.69864f),
                PathNode.LineTo(3.91644f, 19.4986f),
                PathNode.CurveTo(3.96466f, 19.788f, 4.21497f, 20f, 4.50828f, 20f),
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
        addPath(
            pathData = listOf(
                PathNode.MoveTo(7f, 8f),
                PathNode.VerticalTo(6f),
                PathNode.CurveTo(7f, 4.89543f, 7.89543f, 4f, 9f, 4f),
                PathNode.HorizontalTo(15f),
                PathNode.CurveTo(16.1046f, 4f, 17f, 4.89543f, 17f, 6f),
                PathNode.VerticalTo(8f),
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
