package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o71 implements ia1<n71> {

    /* JADX INFO: renamed from: a */
    public final Context f17549a;

    /* JADX INFO: renamed from: b */
    public final lv1 f17550b;

    public o71(Context context, lv1 lv1Var) {
        this.f17549a = context;
        this.f17550b = lv1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<n71> zza() {
        return this.f17550b.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.m71

            /* JADX INFO: renamed from: a */
            public final o71 f16694a;

            {
                this.f16694a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                o71 o71Var = this.f16694a;
                Objects.requireNonNull(o71Var);
                C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                Context context = o71Var.f17549a;
                AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14194G3;
                C2862b c2862b = C2862b.f12493a;
                String string = !((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() ? "" : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                String string2 = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14206I3)).booleanValue() ? o71Var.f17549a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
                Context context2 = o71Var.f17549a;
                boolean zBooleanValue = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14200H3)).booleanValue();
                Bundle bundle = null;
                if (zBooleanValue) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                    Bundle bundle2 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle2.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    for (int i = 0; i < 4; i++) {
                        String str = strArr[i];
                        if (defaultSharedPreferences.contains(str)) {
                            bundle2.putString(str, defaultSharedPreferences.getString(str, null));
                        }
                    }
                    bundle = bundle2;
                }
                return new n71(string, string2, bundle);
            }
        });
    }
}
