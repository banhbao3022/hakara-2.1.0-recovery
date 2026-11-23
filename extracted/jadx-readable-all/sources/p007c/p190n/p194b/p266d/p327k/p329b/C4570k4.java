package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.k4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4570k4 {

    /* JADX INFO: renamed from: a */
    public final String f24054a;

    /* JADX INFO: renamed from: b */
    public final Bundle f24055b;

    /* JADX INFO: renamed from: c */
    public boolean f24056c;

    /* JADX INFO: renamed from: d */
    public Bundle f24057d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C4510f4 f24058e;

    public C4570k4(C4510f4 c4510f4, String str, Bundle bundle) {
        this.f24058e = c4510f4;
        C2622l.m5359e(str);
        this.f24054a = str;
        this.f24055b = new Bundle();
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m10620a() {
        if (!this.f24056c) {
            this.f24056c = true;
            String string = this.f24058e.m10538w().getString(this.f24054a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            byte b = -1;
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode == 115 && string3.equals("s")) {
                                        b = 0;
                                    }
                                } else if (string3.equals("l")) {
                                    b = 2;
                                }
                            } else if (string3.equals("d")) {
                                b = 1;
                            }
                            if (b == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b != 2) {
                                this.f24058e.mo10684l().f24418f.m10812b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f24058e.mo10684l().f24418f.m10811a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f24057d = bundle;
                } catch (JSONException unused2) {
                    this.f24058e.mo10684l().f24418f.m10811a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f24057d == null) {
                this.f24057d = this.f24055b;
            }
        }
        return this.f24057d;
    }

    /* JADX INFO: renamed from: b */
    public final void m10621b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = this.f24058e.m10538w().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.f24054a);
        } else {
            String str = this.f24054a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f24058e.mo10684l().f24418f.m10812b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f24058e.mo10684l().f24418f.m10812b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f24057d = bundle;
    }
}
