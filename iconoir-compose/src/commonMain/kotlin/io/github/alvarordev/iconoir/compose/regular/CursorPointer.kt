// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/cursor-pointer.svg. Do not edit.
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

public val Iconoir.Regular.CursorPointer: ImageVector
    get() = cursorpointerVector.value

private object cursorpointerVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/cursor-pointer", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(19.5027f, 9.96958f),
                PathNode.CurveTo(20.7073f, 10.4588f, 20.6154f, 12.1941f, 19.3658f, 12.5533f),
                PathNode.LineTo(13.0605f, 14.3658f),
                PathNode.LineTo(10.1807f, 20.2606f),
                PathNode.CurveTo(9.60996f, 21.4288f, 7.88499f, 21.218f, 7.6124f, 19.9468f),
                PathNode.LineTo(4.67677f, 6.25646f),
                PathNode.CurveTo(4.44638f, 5.18204f, 5.5121f, 4.2878f, 6.53019f, 4.70126f),
                PathNode.LineTo(19.5027f, 9.96958f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.EvenOdd,
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
