// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/keyframe.svg. Do not edit.
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

public val Iconoir.Solid.Keyframe: ImageVector
    get() = keyframeVector.value

private object keyframeVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/keyframe", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(9.9651f, 2.12378f),
                PathNode.CurveTo(11.0562f, 0.923581f, 12.9437f, 0.923583f, 14.0348f, 2.12379f),
                PathNode.LineTo(21.3319f, 10.1506f),
                PathNode.CurveTo(22.2855f, 11.1995f, 22.2855f, 12.8014f, 21.3319f, 13.8502f),
                PathNode.LineTo(14.0348f, 21.877f),
                PathNode.CurveTo(12.9438f, 23.0772f, 11.0562f, 23.0772f, 9.9651f, 21.877f),
                PathNode.LineTo(2.66806f, 13.8502f),
                PathNode.CurveTo(1.71451f, 12.8014f, 1.71449f, 11.1995f, 2.66804f, 10.1506f),
                PathNode.LineTo(9.9651f, 2.12378f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color.Black),
            stroke = null,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
