package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fa1 implements ia1<ha1<Bundle>> {

    /* JADX INFO: renamed from: a */
    public final lv1 f14001a;

    /* JADX INFO: renamed from: b */
    public final Context f14002b;

    public fa1(lv1 lv1Var, Context context) {
        this.f14001a = lv1Var;
        this.f14002b = context;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m6783a(Context context, JSONArray jSONArray) {
        int i;
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i = 1;
            } else if (iOptInt != 1) {
                i = iOptInt != 2 ? 0 : 3;
            } else {
                i = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i != 0) {
                String[] strArrSplit = strOptString2.split("/");
                int length = strArrSplit.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = strArrSplit[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(strArrSplit[0], 0);
                        str = strArrSplit[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = i - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<ha1<Bundle>> zza() {
        return this.f14001a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.da1

            /* JADX INFO: renamed from: a */
            public final fa1 f13196a;

            {
                this.f13196a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                fa1 fa1Var = this.f13196a;
                Objects.requireNonNull(fa1Var);
                String str = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14212J3);
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    final Bundle bundleM6783a = fa1.m6783a(fa1Var.f14002b, new JSONArray(str));
                    return new ha1(bundleM6783a) { // from class: c.n.b.d.j.a.ea1

                        /* JADX INFO: renamed from: a */
                        public final Bundle f13536a;

                        {
                            this.f13536a = bundleM6783a;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
                        /* JADX INFO: renamed from: d */
                        public final void mo5696d(Object obj) {
                            ((Bundle) obj).putBundle("shared_pref", this.f13536a);
                        }
                    };
                } catch (JSONException e) {
                    C2622l.m5358d3("JSON parsing error", e);
                    return null;
                }
            }
        });
    }
}
