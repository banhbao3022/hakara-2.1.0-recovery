package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.SharedPreferences;
import java.util.Iterator;

/* JADX INFO: renamed from: c.n.b.d.j.a.em */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2997em implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final String f13607a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3071gm f13608b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC2997em(C3071gm c3071gm, String str) {
        this.f13608b = c3071gm;
        this.f13607a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f13608b) {
            Iterator<InterfaceC3034fm> it = this.f13608b.f14612b.iterator();
            while (it.hasNext()) {
                it.next().mo6374a(sharedPreferences, this.f13607a, str);
            }
        }
    }
}
