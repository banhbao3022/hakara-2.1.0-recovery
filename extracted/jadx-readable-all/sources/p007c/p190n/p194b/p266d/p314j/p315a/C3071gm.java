package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.a.gm */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3071gm {

    /* JADX INFO: renamed from: a */
    public final Map<String, SharedPreferencesOnSharedPreferenceChangeListenerC2997em> f14611a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC3034fm> f14612b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Context f14613c;

    /* JADX INFO: renamed from: d */
    public final C3070gl f14614d;

    public C3071gm(Context context, C3070gl c3070gl) {
        this.f14613c = context;
        this.f14614d = c3070gl;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7006a(String str) {
        if (this.f14611a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.f14613c) : this.f14613c.getSharedPreferences(str, 0);
        SharedPreferencesOnSharedPreferenceChangeListenerC2997em sharedPreferencesOnSharedPreferenceChangeListenerC2997em = new SharedPreferencesOnSharedPreferenceChangeListenerC2997em(this, str);
        this.f14611a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC2997em);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2997em);
    }
}
