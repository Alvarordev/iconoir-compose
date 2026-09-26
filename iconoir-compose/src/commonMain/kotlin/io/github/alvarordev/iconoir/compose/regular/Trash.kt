// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/trash.svg. Do not edit.
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

public val Iconoir.Regular.Trash: ImageVector
    get() = trashVector.value

private object trashVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/trash", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(20f, 9f),
                PathNode.LineTo(18.005f, 20.3463f),
                PathNode.CurveTo(17.8369f, 21.3026f, 17.0062f, 22f, 16.0353f, 22f),
                PathNode.HorizontalTo(7.96474f),
                PathNode.CurveTo(6.99379f, 22f, 6.1631f, 21.3026f, 5.99496f, 20.3463f),
                PathNode.LineTo(4f, 9f),
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
                PathNode.MoveTo(21f, 6f),
                PathNode.LineTo(15.375f, 6f),
                PathNode.MoveTo(3f, 6f),
                PathNode.LineTo(8.625f, 6f),
                PathNode.MoveTo(8.625f, 6f),
                PathNode.VerticalTo(4f),
                PathNode.CurveTo(8.625f, 2.89543f, 9.52043f, 2f, 10.625f, 2f),
                PathNode.HorizontalTo(13.375f),
                PathNode.CurveTo(14.4796f, 2f, 15.375f, 2.89543f, 15.375f, 4f),
                PathNode.VerticalTo(6f),
                PathNode.MoveTo(8.625f, 6f),
                PathNode.LineTo(15.375f, 6f),
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
