import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MarsModel(

    val price: String,
    val id: String,
    val type: String,
    val img_src: String
) : Parcelable
