package p007c.p165l.p166h0.p172f0;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.f0.e, reason: use source file name */
/* JADX INFO: compiled from: ModelManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class ModelManager4 {

    /* JADX INFO: renamed from: b */
    public static SharedPreferences f4792b;

    /* JADX INFO: renamed from: a */
    public static final ConcurrentMap<String, Model2> f4791a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final String[] f4793c = {"version_id", "asset_uri", "use_case", "thresholds", "rules_uri"};

    /* JADX INFO: renamed from: a */
    public static JSONObject m2332a() {
        ArrayList arrayList = new ArrayList(Arrays.asList(f4793c));
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", arrayList));
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        GraphRequest2 graphRequest2M2675l = GraphRequest2.m2675l(null, String.format("%s/model_asset", FacebookSdk.f5354c), null);
        graphRequest2M2675l.f5384m = true;
        graphRequest2M2675l.f5380i = bundle;
        JSONObject jSONObject = graphRequest2M2675l.m2687d().f5408c;
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                if (jSONObject3.has("rules_uri")) {
                    jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                }
                jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: b */
    public static Model2 m2333b(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("use_case");
            String string2 = jSONObject.getString("asset_uri");
            JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
            int i = Integer.parseInt(jSONObject.getString("version_id"));
            String strOptString = jSONObject.optString("rules_uri", null);
            float[] fArr = new float[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    fArr[i2] = Float.parseFloat(jSONArray.getString(i2));
                } catch (JSONException unused) {
                }
            }
            return new Model2(string, i, string2, strOptString, fArr);
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m2334c(String str, float[] fArr, String str2) {
        ConcurrentMap<String, Model2> concurrentMap = f4791a;
        if (!concurrentMap.containsKey(str)) {
            return null;
        }
        Model2 model2 = concurrentMap.get(str);
        Objects.requireNonNull(model2);
        int[] iArr = new int[128];
        byte[] bytes = TextUtils.join(" ", str2.trim().split("\\s+")).getBytes(Charset.forName(Utf8Charset.NAME));
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            if (i2 < bytes.length) {
                iArr[i2] = bytes[i2] & 255;
            } else {
                iArr[i2] = 0;
            }
        }
        float[] fArr2 = model2.f4771k.f4790b;
        float[] fArr3 = new float[8192];
        for (int i3 = 0; i3 < 1; i3++) {
            for (int i4 = 0; i4 < 128; i4++) {
                int i5 = iArr[(i3 * 128) + i4];
                for (int i6 = 0; i6 < 64; i6++) {
                    fArr3[outline.m1591m(i4, 64, 8192 * i3, i6)] = fArr2[(i5 * 64) + i6];
                }
            }
        }
        Model2.d dVar = model2.f4772l;
        float[] fArr4 = dVar.f4790b;
        int[] iArr2 = dVar.f4789a;
        float[] fArrM1015d = C0244f.m1015d(fArr3, fArr4, 1, 128, 64, iArr2[2], iArr2[0]);
        Model2.d dVar2 = model2.f4773m;
        float[] fArr5 = dVar2.f4790b;
        int[] iArr3 = dVar2.f4789a;
        float[] fArrM1015d2 = C0244f.m1015d(fArr3, fArr5, 1, 128, 64, iArr3[2], iArr3[0]);
        Model2.d dVar3 = model2.f4774n;
        float[] fArr6 = dVar3.f4790b;
        int[] iArr4 = dVar3.f4789a;
        float[] fArrM1015d3 = C0244f.m1015d(fArr3, fArr6, 1, 128, 64, iArr4[2], iArr4[0]);
        float[] fArr7 = model2.f4775o.f4790b;
        int[] iArr5 = model2.f4772l.f4789a;
        C0244f.m1012a(fArrM1015d, fArr7, 1, (128 - iArr5[2]) + 1, iArr5[0]);
        float[] fArr8 = model2.f4776p.f4790b;
        int[] iArr6 = model2.f4773m.f4789a;
        C0244f.m1012a(fArrM1015d2, fArr8, 1, (128 - iArr6[2]) + 1, iArr6[0]);
        float[] fArr9 = model2.f4777q.f4790b;
        int[] iArr7 = model2.f4774n.f4789a;
        C0244f.m1012a(fArrM1015d3, fArr9, 1, (128 - iArr7[2]) + 1, iArr7[0]);
        int[] iArr8 = model2.f4772l.f4789a;
        C0244f.m1023l(fArrM1015d, ((128 - iArr8[2]) + 1) * iArr8[0]);
        int[] iArr9 = model2.f4773m.f4789a;
        C0244f.m1023l(fArrM1015d2, ((128 - iArr9[2]) + 1) * iArr9[0]);
        int[] iArr10 = model2.f4774n.f4789a;
        C0244f.m1023l(fArrM1015d3, ((128 - iArr10[2]) + 1) * iArr10[0]);
        int[] iArr11 = model2.f4772l.f4789a;
        float[] fArrM1021j = C0244f.m1021j(fArrM1015d, (128 - iArr11[2]) + 1, iArr11[0], (128 - iArr11[2]) + 1);
        int[] iArr12 = model2.f4773m.f4789a;
        float[] fArrM1021j2 = C0244f.m1021j(fArrM1015d2, (128 - iArr12[2]) + 1, iArr12[0], (128 - iArr12[2]) + 1);
        int[] iArr13 = model2.f4774n.f4789a;
        float[] fArrM1014c = C0244f.m1014c(C0244f.m1014c(C0244f.m1014c(fArrM1021j, fArrM1021j2), C0244f.m1021j(fArrM1015d3, (128 - iArr13[2]) + 1, iArr13[0], (128 - iArr13[2]) + 1)), fArr);
        Model2.d dVar4 = model2.f4778r;
        float[] fArr10 = dVar4.f4790b;
        float[] fArr11 = model2.f4781u.f4790b;
        int[] iArr14 = dVar4.f4789a;
        float[] fArrM1016e = C0244f.m1016e(fArrM1014c, fArr10, fArr11, 1, iArr14[1], iArr14[0]);
        C0244f.m1023l(fArrM1016e, model2.f4781u.f4789a[0]);
        Model2.d dVar5 = model2.f4779s;
        float[] fArr12 = dVar5.f4790b;
        float[] fArr13 = model2.f4782v.f4790b;
        int[] iArr15 = dVar5.f4789a;
        float[] fArrM1016e2 = C0244f.m1016e(fArrM1016e, fArr12, fArr13, 1, iArr15[1], iArr15[0]);
        C0244f.m1023l(fArrM1016e2, model2.f4782v.f4789a[0]);
        Model2.d dVar6 = model2.f4780t;
        float[] fArr14 = dVar6.f4790b;
        float[] fArr15 = model2.f4783w.f4790b;
        int[] iArr16 = dVar6.f4789a;
        float[] fArrM1016e3 = C0244f.m1016e(fArrM1016e2, fArr14, fArr15, 1, iArr16[1], iArr16[0]);
        int i7 = model2.f4783w.f4789a[0];
        float f = Float.MIN_VALUE;
        for (int i8 = 0; i8 < i7; i8++) {
            if (fArrM1016e3[i8] > f) {
                f = fArrM1016e3[i8];
            }
        }
        for (int i9 = 0; i9 < i7; i9++) {
            fArrM1016e3[i9] = (float) Math.exp(fArrM1016e3[i9] - f);
        }
        float f2 = 0.0f;
        for (int i10 = 0; i10 < i7; i10++) {
            f2 += fArrM1016e3[i10];
        }
        for (int i11 = 0; i11 < i7; i11++) {
            fArrM1016e3[i11] = fArrM1016e3[i11] / f2;
        }
        if (fArrM1016e3.length == 0 || model2.f4768h.length == 0) {
            return null;
        }
        if (!model2.f4763c.equals("SUGGEST_EVENT")) {
            if (!model2.f4763c.equals("DATA_DETECTION_ADDRESS") || fArrM1016e3[1] < model2.f4768h[0]) {
                return null;
            }
            return "SHOULD_FILTER";
        }
        if (model2.f4768h.length != fArrM1016e3.length) {
            return null;
        }
        while (true) {
            float[] fArr16 = model2.f4768h;
            if (i >= fArr16.length) {
                return "other";
            }
            if (fArrM1016e3[i] >= fArr16[i]) {
                return Model2.f4761a.get(i);
            }
            i++;
        }
    }
}
