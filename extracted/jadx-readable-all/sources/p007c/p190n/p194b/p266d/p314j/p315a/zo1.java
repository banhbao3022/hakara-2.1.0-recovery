package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zo1 implements go1 {

    /* JADX INFO: renamed from: a */
    public static final zo1 f22366a = new zo1();

    /* JADX INFO: renamed from: b */
    public static final Handler f22367b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public static Handler f22368c = null;

    /* JADX INFO: renamed from: d */
    public static final Runnable f22369d = new vo1();

    /* JADX INFO: renamed from: e */
    public static final Runnable f22370e = new wo1();

    /* JADX INFO: renamed from: g */
    public int f22372g;

    /* JADX INFO: renamed from: k */
    public long f22376k;

    /* JADX INFO: renamed from: f */
    public final List<yo1> f22371f = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ro1 f22374i = new ro1();

    /* JADX INFO: renamed from: h */
    public final io1 f22373h = new io1();

    /* JADX INFO: renamed from: j */
    public final to1 f22375j = new to1(new cp1());

    /* JADX INFO: renamed from: a */
    public final void m8895a(View view, ho1 ho1Var, JSONObject jSONObject) {
        Object obj;
        if (C2622l.m5293O1(view) == null) {
            ro1 ro1Var = this.f22374i;
            char c2 = ro1Var.f18984d.contains(view) ? (char) 1 : ro1Var.f18988h ? (char) 2 : (char) 3;
            if (c2 == 3) {
                return;
            }
            JSONObject jSONObjectMo7151c = ho1Var.mo7151c(view);
            po1.m8134c(jSONObject, jSONObjectMo7151c);
            ro1 ro1Var2 = this.f22374i;
            if (ro1Var2.f18981a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) ro1Var2.f18981a.get(view);
                if (obj2 != null) {
                    ro1Var2.f18981a.remove(view);
                }
                obj = obj2;
            }
            if (obj != null) {
                try {
                    jSONObjectMo7151c.put("adSessionId", obj);
                } catch (JSONException e) {
                    C2622l.m5351c1("Error with setting ad session id", e);
                }
                this.f22374i.f18988h = true;
            } else {
                ro1 ro1Var3 = this.f22374i;
                qo1 qo1Var = ro1Var3.f18982b.get(view);
                if (qo1Var != null) {
                    ro1Var3.f18982b.remove(view);
                }
                if (qo1Var != null) {
                    bo1 bo1Var = qo1Var.f18396a;
                    JSONArray jSONArray = new JSONArray();
                    ArrayList<String> arrayList = qo1Var.f18397b;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        jSONArray.put(arrayList.get(i));
                    }
                    try {
                        jSONObjectMo7151c.put("isFriendlyObstructionFor", jSONArray);
                        jSONObjectMo7151c.put("friendlyObstructionClass", bo1Var.f12759b);
                        jSONObjectMo7151c.put("friendlyObstructionPurpose", bo1Var.f12760c);
                        jSONObjectMo7151c.put("friendlyObstructionReason", bo1Var.f12761d);
                    } catch (JSONException e2) {
                        C2622l.m5351c1("Error with setting friendly obstruction", e2);
                    }
                }
                ho1Var.mo7150a(view, jSONObjectMo7151c, this, c2 == 1);
            }
            this.f22372g++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8896b() {
        if (f22368c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f22368c = handler;
            handler.post(f22369d);
            f22368c.postDelayed(f22370e, 200L);
        }
    }
}
