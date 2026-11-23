package p007c.p190n.p194b.p266d.p298f.p299o;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: c.n.b.d.f.o.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2629b extends Exception {

    /* JADX INFO: renamed from: f */
    @RecentlyNonNull
    @Deprecated
    public final Status f11608f;

    public C2629b(@RecentlyNonNull Status status) {
        int i = status.f28654l;
        String str = status.f28655m;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f11608f = status;
    }
}
