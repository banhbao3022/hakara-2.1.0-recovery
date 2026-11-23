package p007c.p190n.p194b.p266d.p298f.p302q.p303x;

import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: renamed from: c.n.b.d.f.q.x.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2768b extends RuntimeException {
    public C2768b(@RecentlyNonNull String str, @RecentlyNonNull Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
        sb.append(str);
        sb.append(" Parcel: pos=");
        sb.append(iDataPosition);
        sb.append(" size=");
        sb.append(iDataSize);
        super(sb.toString());
    }
}
