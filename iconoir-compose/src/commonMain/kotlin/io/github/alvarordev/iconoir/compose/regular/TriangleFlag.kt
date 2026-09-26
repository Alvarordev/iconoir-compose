// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/triangle-flag.svg. Do not edit.
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

public val Iconoir.Regular.TriangleFlag: ImageVector
    get() = triangleflagVector.value

private object triangleflagVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/triangle-flag", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(8f, 21f),
                PathNode.LineTo(8f, 16f),
                PathNode.MoveTo(8f, 16f),
                PathNode.VerticalTo(3.57709f),
                PathNode.CurveTo(8f, 3.10699f, 8.5161f, 2.81949f, 8.91581f, 3.06693f),
                PathNode.LineTo(17.7061f, 8.50854f),
                PathNode.CurveTo(18.0775f, 8.73848f, 18.0866f, 9.2756f, 17.7231f, 9.51793f),
                PathNode.LineTo(8f, 16f),
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
