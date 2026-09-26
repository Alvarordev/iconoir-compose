// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/music-note.svg. Do not edit.
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

public val Iconoir.Regular.MusicNote: ImageVector
    get() = musicnoteVector.value

private object musicnoteVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/music-note", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 16f),
                PathNode.VerticalTo(19f),
                PathNode.CurveTo(12f, 20.1046f, 11.1046f, 21f, 10f, 21f),
                PathNode.HorizontalTo(9f),
                PathNode.CurveTo(7.89543f, 21f, 7f, 20.1046f, 7f, 19f),
                PathNode.VerticalTo(18f),
                PathNode.CurveTo(7f, 16.8954f, 7.89543f, 16f, 9f, 16f),
                PathNode.HorizontalTo(12f),
                PathNode.Close,
                PathNode.MoveTo(12f, 16f),
                PathNode.VerticalTo(8f),
                PathNode.MoveTo(12f, 8f),
                PathNode.VerticalTo(4f),
                PathNode.LineTo(17f, 3f),
                PathNode.VerticalTo(7f),
                PathNode.LineTo(12f, 8f),
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
