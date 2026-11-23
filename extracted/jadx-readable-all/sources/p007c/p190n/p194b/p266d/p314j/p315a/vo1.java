package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vo1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zo1 zo1Var = zo1.f22366a;
        zo1Var.f22372g = 0;
        zo1Var.f22376k = System.nanoTime();
        ro1 ro1Var = zo1Var.f22374i;
        Objects.requireNonNull(ro1Var);
        yn1 yn1Var = yn1.f21931a;
        if (yn1Var != null) {
            for (nn1 nn1Var : yn1Var.m8807b()) {
                View viewM7897g = nn1Var.m7897g();
                if (nn1Var.f17180f && !nn1Var.f17181g) {
                    String str2 = nn1Var.f17182h;
                    if (viewM7897g != null) {
                        if (viewM7897g.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = viewM7897g;
                            while (true) {
                                if (view == null) {
                                    ro1Var.f18984d.addAll(hashSet);
                                    str = null;
                                    break;
                                }
                                String strM5293O1 = C2622l.m5293O1(view);
                                if (strM5293O1 != null) {
                                    str = strM5293O1;
                                    break;
                                } else {
                                    hashSet.add(view);
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                        if (str == null) {
                            ro1Var.f18985e.add(str2);
                            ro1Var.f18981a.put(viewM7897g, str2);
                            for (bo1 bo1Var : nn1Var.f17177c) {
                                View view2 = bo1Var.f12758a.get();
                                if (view2 != null) {
                                    qo1 qo1Var = ro1Var.f18982b.get(view2);
                                    if (qo1Var != null) {
                                        qo1Var.f18397b.add(nn1Var.f17182h);
                                    } else {
                                        ro1Var.f18982b.put(view2, new qo1(bo1Var, nn1Var.f17182h));
                                    }
                                }
                            }
                        } else {
                            ro1Var.f18986f.add(str2);
                            ro1Var.f18983c.put(str2, viewM7897g);
                            ro1Var.f18987g.put(str2, str);
                        }
                    } else {
                        ro1Var.f18986f.add(str2);
                        ro1Var.f18987g.put(str2, "noAdView");
                    }
                }
            }
        }
        long jNanoTime = System.nanoTime();
        jo1 jo1Var = zo1Var.f22373h.f15333b;
        if (zo1Var.f22374i.f18986f.size() > 0) {
            for (String str3 : zo1Var.f22374i.f18986f) {
                JSONObject jSONObjectM8132a = po1.m8132a(0, 0, 0, 0);
                View view3 = zo1Var.f22374i.f18983c.get(str3);
                ko1 ko1Var = zo1Var.f22373h.f15332a;
                String str4 = zo1Var.f22374i.f18987g.get(str3);
                if (str4 != null) {
                    JSONObject jSONObjectMo7151c = ko1Var.mo7151c(view3);
                    try {
                        jSONObjectMo7151c.put("adSessionId", str3);
                    } catch (JSONException e) {
                        C2622l.m5351c1("Error with setting ad session id", e);
                    }
                    try {
                        jSONObjectMo7151c.put("notVisibleReason", str4);
                    } catch (JSONException e2) {
                        C2622l.m5351c1("Error with setting not visible reason", e2);
                    }
                    po1.m8134c(jSONObjectM8132a, jSONObjectMo7151c);
                }
                po1.m8135d(jSONObjectM8132a);
                HashSet hashSet2 = new HashSet();
                hashSet2.add(str3);
                to1 to1Var = zo1Var.f22375j;
                to1Var.f19932b.m6219a(new ep1(to1Var, hashSet2, jSONObjectM8132a, jNanoTime, null));
            }
        }
        if (zo1Var.f22374i.f18985e.size() > 0) {
            JSONObject jSONObjectM8132a2 = po1.m8132a(0, 0, 0, 0);
            jo1Var.mo7150a(null, jSONObjectM8132a2, zo1Var, true);
            po1.m8135d(jSONObjectM8132a2);
            to1 to1Var2 = zo1Var.f22375j;
            to1Var2.f19932b.m6219a(new fp1(to1Var2, zo1Var.f22374i.f18985e, jSONObjectM8132a2, jNanoTime, null));
        } else {
            to1 to1Var3 = zo1Var.f22375j;
            to1Var3.f19932b.m6219a(new dp1(to1Var3, null));
        }
        ro1 ro1Var2 = zo1Var.f22374i;
        ro1Var2.f18981a.clear();
        ro1Var2.f18982b.clear();
        ro1Var2.f18983c.clear();
        ro1Var2.f18984d.clear();
        ro1Var2.f18985e.clear();
        ro1Var2.f18986f.clear();
        ro1Var2.f18987g.clear();
        ro1Var2.f18988h = false;
        long jNanoTime2 = System.nanoTime() - zo1Var.f22376k;
        if (zo1Var.f22371f.size() > 0) {
            for (yo1 yo1Var : zo1Var.f22371f) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                yo1Var.m8816a();
                if (yo1Var instanceof xo1) {
                    ((xo1) yo1Var).zza();
                }
            }
        }
    }
}
