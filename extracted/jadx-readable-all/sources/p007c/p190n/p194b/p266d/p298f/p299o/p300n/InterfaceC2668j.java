package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2668j {
    /* JADX INFO: renamed from: a */
    void mo5540a(@RecentlyNonNull String str, @RecentlyNonNull LifecycleCallback lifecycleCallback);

    @RecentlyNullable
    /* JADX INFO: renamed from: e */
    <T extends LifecycleCallback> T mo5541e(@RecentlyNonNull String str, @RecentlyNonNull Class<T> cls);

    @RecentlyNonNull
    /* JADX INFO: renamed from: f */
    Activity mo5542f();

    void startActivityForResult(@RecentlyNonNull Intent intent, int i);
}
