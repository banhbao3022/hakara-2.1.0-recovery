package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: renamed from: c.n.b.d.j.a.cl */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2922cl implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final Context f13046a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f13047b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2305w0 f13048c;

    /* JADX INFO: renamed from: d */
    public final C2885bm f13049d;

    /* JADX INFO: renamed from: e */
    public String f13050e = "";

    public SharedPreferencesOnSharedPreferenceChangeListenerC2922cl(Context context, InterfaceC2305w0 interfaceC2305w0, C2885bm c2885bm) {
        this.f13047b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f13048c = interfaceC2305w0;
        this.f13046a = context;
        this.f13049d = c2885bm;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Context context;
        if ("IABTCF_PurposeConsents".equals(str)) {
            String string = sharedPreferences.getString("IABTCF_PurposeConsents", "");
            if (string.isEmpty() || this.f13050e.equals(string)) {
                return;
            }
            this.f13050e = string;
            boolean z = string.charAt(0) != '1';
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14381k0;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                this.f13048c.mo4821s0(z);
                if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14236N3)).booleanValue() && z && (context = this.f13046a) != null) {
                    context.deleteDatabase("OfflineUpload.db");
                }
            }
            if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14353g0)).booleanValue()) {
                synchronized (this.f13049d.f12743l) {
                }
            }
        }
    }
}
