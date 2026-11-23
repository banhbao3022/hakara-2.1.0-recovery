package p007c.p190n.p194b.p266d.p298f.p302q;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.f.q.q */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2753q {

    /* JADX INFO: renamed from: a */
    public final List<String> f11897a;

    /* JADX INFO: renamed from: b */
    public final Object f11898b;

    public C2753q(Object obj) {
        Objects.requireNonNull(obj, "null reference");
        this.f11898b = obj;
        this.f11897a = new ArrayList();
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public C2753q m5608a(@RecentlyNonNull String str, Object obj) {
        List<String> list = this.f11897a;
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + strValueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(strValueOf);
        list.add(sb.toString());
        return this;
    }

    @RecentlyNonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f11898b.getClass().getSimpleName());
        sb.append('{');
        int size = this.f11897a.size();
        for (int i = 0; i < size; i++) {
            sb.append(this.f11897a.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
