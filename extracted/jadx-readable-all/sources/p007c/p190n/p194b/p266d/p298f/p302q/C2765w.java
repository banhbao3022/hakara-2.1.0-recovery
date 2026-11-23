package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.Objects;
import mtp.media.karaoke.R;

/* JADX INFO: renamed from: c.n.b.d.f.q.w */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2765w {

    /* JADX INFO: renamed from: a */
    public final Resources f11925a;

    /* JADX INFO: renamed from: b */
    public final String f11926b;

    public C2765w(@RecentlyNonNull Context context) {
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        this.f11925a = resources;
        this.f11926b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @RecentlyNullable
    /* JADX INFO: renamed from: a */
    public String m5611a(@RecentlyNonNull String str) {
        int identifier = this.f11925a.getIdentifier(str, "string", this.f11926b);
        if (identifier == 0) {
            return null;
        }
        return this.f11925a.getString(identifier);
    }
}
