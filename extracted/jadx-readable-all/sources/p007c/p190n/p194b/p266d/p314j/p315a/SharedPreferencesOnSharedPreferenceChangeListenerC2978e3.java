package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.e3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2978e3 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g */
    public Context f13472g;

    /* JADX INFO: renamed from: a */
    public final Object f13466a = new Object();

    /* JADX INFO: renamed from: b */
    public final ConditionVariable f13467b = new ConditionVariable();

    /* JADX INFO: renamed from: c */
    public volatile boolean f13468c = false;

    /* JADX INFO: renamed from: d */
    public volatile boolean f13469d = false;

    /* JADX INFO: renamed from: e */
    public SharedPreferences f13470e = null;

    /* JADX INFO: renamed from: f */
    public Bundle f13471f = new Bundle();

    /* JADX INFO: renamed from: h */
    public JSONObject f13473h = new JSONObject();

    /* JADX INFO: renamed from: a */
    public final <T> T m6596a(final AbstractC3718y2<T> abstractC3718y2) {
        if (!this.f13467b.block(5000L)) {
            synchronized (this.f13466a) {
                if (!this.f13469d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f13468c || this.f13470e == null) {
            synchronized (this.f13466a) {
                if (this.f13468c && this.f13470e != null) {
                }
                return abstractC3718y2.f21732c;
            }
        }
        int i = abstractC3718y2.f21730a;
        if (i != 2) {
            return (i == 1 && this.f13473h.has(abstractC3718y2.f21731b)) ? abstractC3718y2.mo8393c(this.f13473h) : (T) C2622l.m5238D0(new ls1(this, abstractC3718y2) { // from class: c.n.b.d.j.a.b3

                /* JADX INFO: renamed from: a */
                public final SharedPreferencesOnSharedPreferenceChangeListenerC2978e3 f12509a;

                /* JADX INFO: renamed from: b */
                public final AbstractC3718y2 f12510b;

                {
                    this.f12509a = this;
                    this.f12510b = abstractC3718y2;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.ls1
                public final Object zza() {
                    return this.f12510b.mo8394d(this.f12509a.f13470e);
                }
            });
        }
        Bundle bundle = this.f13471f;
        return bundle == null ? abstractC3718y2.f21732c : abstractC3718y2.mo8391a(bundle);
    }

    /* JADX INFO: renamed from: b */
    public final void m6597b() {
        if (this.f13470e == null) {
            return;
        }
        try {
            this.f13473h = new JSONObject((String) C2622l.m5238D0(new ls1(this) { // from class: c.n.b.d.j.a.c3

                /* JADX INFO: renamed from: a */
                public final SharedPreferencesOnSharedPreferenceChangeListenerC2978e3 f12927a;

                {
                    this.f12927a = this;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.ls1
                public final Object zza() {
                    return this.f12927a.f13470e.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m6597b();
        }
    }
}
