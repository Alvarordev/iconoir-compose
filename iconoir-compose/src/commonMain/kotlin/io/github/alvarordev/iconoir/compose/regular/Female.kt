// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/female.svg. Do not edit.
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

public val Iconoir.Regular.Female: ImageVector
    get() = femaleVector.value

private object femaleVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/female", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 15f),
                PathNode.CurveTo(15.3137f, 15f, 18f, 12.3137f, 18f, 9f),
                PathNode.CurveTo(18f, 5.68629f, 15.3137f, 3f, 12f, 3f),
                PathNode.CurveTo(8.68629f, 3f, 6f, 5.68629f, 6f, 9f),
                PathNode.CurveTo(6f, 12.3137f, 8.68629f, 15f, 12f, 15f),
                PathNode.Close,
                PathNode.MoveTo(12f, 15f),
                PathNode.VerticalTo(19f),
                PathNode.MoveTo(12f, 21f),
                PathNode.VerticalTo(19f),
                PathNode.MoveTo(12f, 19f),
                PathNode.HorizontalTo(10f),
                PathNode.MoveTo(12f, 19f),
                PathNode.HorizontalTo(14f),
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
