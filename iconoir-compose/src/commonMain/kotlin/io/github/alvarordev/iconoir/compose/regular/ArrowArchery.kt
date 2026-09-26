// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/arrow-archery.svg. Do not edit.
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

public val Iconoir.Regular.ArrowArchery: ImageVector
    get() = arrowarcheryVector.value

private object arrowarcheryVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/arrow-archery", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(8.61096f, 15.8891f),
                PathNode.LineTo(20.6318f, 3.86829f),
                PathNode.MoveTo(8.61096f, 15.8891f),
                PathNode.HorizontalTo(5.78253f),
                PathNode.LineTo(2.9541f, 18.7175f),
                PathNode.HorizontalTo(5.78253f),
                PathNode.VerticalTo(21.546f),
                PathNode.LineTo(8.61096f, 18.7175f),
                PathNode.VerticalTo(15.8891f),
                PathNode.Close,
                PathNode.MoveTo(20.6318f, 3.86829f),
                PathNode.HorizontalTo(17.8033f),
                PathNode.MoveTo(20.6318f, 3.86829f),
                PathNode.VerticalTo(6.69671f),
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
