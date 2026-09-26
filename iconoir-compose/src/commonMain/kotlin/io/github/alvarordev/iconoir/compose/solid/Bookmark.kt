// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/bookmark.svg. Do not edit.
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

public val Iconoir.Solid.Bookmark: ImageVector
    get() = bookmarkVector.value

private object bookmarkVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/bookmark", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(5f, 21f),
                PathNode.VerticalTo(5f),
                PathNode.CurveTo(5f, 3.89543f, 5.89543f, 3f, 7f, 3f),
                PathNode.HorizontalTo(17f),
                PathNode.CurveTo(18.1046f, 3f, 19f, 3.89543f, 19f, 5f),
                PathNode.VerticalTo(21f),
                PathNode.LineTo(13.0815f, 17.1953f),
                PathNode.CurveTo(12.4227f, 16.7717f, 11.5773f, 16.7717f, 10.9185f, 17.1953f),
                PathNode.LineTo(5f, 21f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
