package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class s81 implements ia1<t81> {

    /* JADX INFO: renamed from: a */
    public final lv1 f19485a;

    /* JADX INFO: renamed from: b */
    public final ii1 f19486b;

    /* JADX INFO: renamed from: c */
    public final PackageInfo f19487c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2305w0 f19488d;

    public s81(lv1 lv1Var, ii1 ii1Var, PackageInfo packageInfo, InterfaceC2305w0 interfaceC2305w0) {
        this.f19485a = lv1Var;
        this.f19486b = ii1Var;
        this.f19487c = packageInfo;
        this.f19488d = interfaceC2305w0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<t81> zza() {
        return this.f19485a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.o81

            /* JADX INFO: renamed from: a */
            public final s81 f17555a;

            {
                this.f17555a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                final s81 s81Var = this.f17555a;
                final ArrayList<String> arrayList = s81Var.f19486b.f15194g;
                if (arrayList == null) {
                    return p81.f17878a;
                }
                return arrayList.isEmpty() ? q81.f18234a : new t81(s81Var, arrayList) { // from class: c.n.b.d.j.a.r81

                    /* JADX INFO: renamed from: a */
                    public final s81 f18718a;

                    /* JADX INFO: renamed from: b */
                    public final ArrayList f18719b;

                    {
                        this.f18718a = s81Var;
                        this.f18719b = arrayList;
                    }

                    /* JADX WARN: Code duplicated, block: B:60:0x010c  */
                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
                    /* JADX INFO: renamed from: d */
                    public final void mo5696d(Bundle bundle) {
                        String str;
                        JSONArray jSONArrayOptJSONArray;
                        String str2;
                        s81 s81Var2 = this.f18718a;
                        ArrayList<String> arrayList2 = this.f18719b;
                        Bundle bundle2 = bundle;
                        Objects.requireNonNull(s81Var2);
                        bundle2.putInt("native_version", 3);
                        bundle2.putStringArrayList("native_templates", arrayList2);
                        bundle2.putStringArrayList("native_custom_templates", s81Var2.f19486b.f15195h);
                        String str3 = "landscape";
                        if (s81Var2.f19486b.f15196i.f15475f > 3) {
                            bundle2.putBoolean("enable_native_media_orientation", true);
                            int i = s81Var2.f19486b.f15196i.f15482m;
                            if (i == 1) {
                                str2 = "any";
                            } else if (i == 2) {
                                str2 = "landscape";
                            } else if (i != 3) {
                                str2 = i != 4 ? "unknown" : "square";
                            } else {
                                str2 = "portrait";
                            }
                            if (!"unknown".equals(str2)) {
                                bundle2.putString("native_media_orientation", str2);
                            }
                        }
                        int i2 = s81Var2.f19486b.f15196i.f15477h;
                        if (i2 == 0) {
                            str3 = "any";
                        } else if (i2 == 1) {
                            str3 = "portrait";
                        } else if (i2 != 2) {
                            str3 = "unknown";
                        }
                        if (!"unknown".equals(str3)) {
                            bundle2.putString("native_image_orientation", str3);
                        }
                        bundle2.putBoolean("native_multiple_images", s81Var2.f19486b.f15196i.f15478i);
                        bundle2.putBoolean("use_custom_mute", s81Var2.f19486b.f15196i.f15481l);
                        PackageInfo packageInfo = s81Var2.f19487c;
                        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
                        if (i3 > s81Var2.f19488d.mo4814j()) {
                            s81Var2.f19488d.mo4810N();
                            s81Var2.f19488d.mo4816n0(i3);
                        }
                        JSONObject jSONObjectMo4809B = s81Var2.f19488d.mo4809B();
                        String string = null;
                        if (jSONObjectMo4809B != null && (jSONArrayOptJSONArray = jSONObjectMo4809B.optJSONArray(s81Var2.f19486b.f15193f)) != null) {
                            string = jSONArrayOptJSONArray.toString();
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle2.putString("native_advanced_settings", string);
                        }
                        int i4 = s81Var2.f19486b.f15198k;
                        if (i4 > 1) {
                            bundle2.putInt("max_num_ads", i4);
                        }
                        C3170ja c3170ja = s81Var2.f19486b.f15189b;
                        if (c3170ja != null) {
                            if (TextUtils.isEmpty(c3170ja.f15514h)) {
                                if (c3170ja.f15512f >= 2) {
                                    int i5 = c3170ja.f15515i;
                                    if (i5 == 2 || i5 != 3) {
                                        str = "l";
                                    } else {
                                        str = "p";
                                    }
                                } else {
                                    int i6 = c3170ja.f15513g;
                                    if (i6 != 1) {
                                        if (i6 != 2) {
                                            StringBuilder sb = new StringBuilder(52);
                                            sb.append("Instream ad video aspect ratio ");
                                            sb.append(i6);
                                            sb.append(" is wrong.");
                                            C2622l.m5408n3(sb.toString());
                                        } else {
                                            str = "p";
                                        }
                                    }
                                    str = "l";
                                }
                                bundle2.putString("ia_var", str);
                            } else {
                                bundle2.putString("ad_tag", c3170ja.f15514h);
                            }
                            bundle2.putBoolean("instr", true);
                        }
                        if (s81Var2.f19486b.m7255a() != null) {
                            bundle2.putBoolean("has_delayed_banner_listener", true);
                        }
                    }
                };
            }
        });
    }
}
