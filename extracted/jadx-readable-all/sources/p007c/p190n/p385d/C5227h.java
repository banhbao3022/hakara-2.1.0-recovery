package p007c.p190n.p385d;

import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.d.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C5227h extends Exception {
    @Deprecated
    public C5227h() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5227h(@RecentlyNonNull String str) {
        super(str);
        C2622l.m5364f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5227h(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
        super(str, th);
        C2622l.m5364f(str, "Detail message must not be empty");
    }
}
