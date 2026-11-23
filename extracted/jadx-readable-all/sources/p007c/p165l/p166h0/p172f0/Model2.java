package p007c.p165l.p166h0.p172f0;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.f0.a, reason: use source file name */
/* JADX INFO: compiled from: Model.java */
/* JADX INFO: loaded from: classes.dex */
public final class Model2 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f4761a = Arrays.asList("fb_mobile_add_to_cart", "fb_mobile_complete_registration", "other", "fb_mobile_purchase");

    /* JADX INFO: renamed from: b */
    public static final Map<String, String> f4762b = new a();

    /* JADX INFO: renamed from: c */
    public String f4763c;

    /* JADX INFO: renamed from: d */
    public File f4764d;

    /* JADX INFO: renamed from: e */
    public File f4765e;

    /* JADX INFO: renamed from: f */
    public File f4766f;

    /* JADX INFO: renamed from: g */
    public int f4767g;

    /* JADX INFO: renamed from: h */
    public float[] f4768h;

    /* JADX INFO: renamed from: i */
    public String f4769i;

    /* JADX INFO: renamed from: j */
    public String f4770j;

    /* JADX INFO: renamed from: k */
    public d f4771k;

    /* JADX INFO: renamed from: l */
    public d f4772l;

    /* JADX INFO: renamed from: m */
    public d f4773m;

    /* JADX INFO: renamed from: n */
    public d f4774n;

    /* JADX INFO: renamed from: o */
    public d f4775o;

    /* JADX INFO: renamed from: p */
    public d f4776p;

    /* JADX INFO: renamed from: q */
    public d f4777q;

    /* JADX INFO: renamed from: r */
    public d f4778r;

    /* JADX INFO: renamed from: s */
    public d f4779s;

    /* JADX INFO: renamed from: t */
    public d f4780t;

    /* JADX INFO: renamed from: u */
    public d f4781u;

    /* JADX INFO: renamed from: v */
    public d f4782v;

    /* JADX INFO: renamed from: w */
    public d f4783w;

    /* JADX INFO: renamed from: c.l.h0.f0.a$a */
    /* JADX INFO: compiled from: Model.java */
    public static class a extends HashMap<String, String> {
        public a() {
            put("embedding.weight", "embed.weight");
            put("dense1.weight", "fc1.weight");
            put("dense2.weight", "fc2.weight");
            put("dense3.weight", "fc3.weight");
            put("dense1.bias", "fc1.bias");
            put("dense2.bias", "fc2.bias");
            put("dense3.bias", "fc3.bias");
        }
    }

    /* JADX INFO: renamed from: c.l.h0.f0.a$b */
    /* JADX INFO: compiled from: Model.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Runnable f4784f;

        public b(Runnable runnable) {
            this.f4784f = runnable;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Model2 model2;
            Runnable runnable;
            Model2 model3 = Model2.this;
            Objects.requireNonNull(model3);
            try {
                FileInputStream fileInputStream = new FileInputStream(model3.f4764d);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable >= 4) {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    int i = byteBufferWrap.getInt();
                    int i2 = i + 4;
                    if (iAvailable >= i2) {
                        JSONObject jSONObject = new JSONObject(new String(bArr, 4, i));
                        JSONArray jSONArrayNames = jSONObject.names();
                        int length = jSONArrayNames.length();
                        String[] strArr = new String[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            strArr[i3] = jSONArrayNames.getString(i3);
                        }
                        Arrays.sort(strArr);
                        HashMap map = new HashMap();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                model3.f4771k = (d) map.get("embed.weight");
                                model3.f4772l = (d) map.get("convs.0.weight");
                                model3.f4773m = (d) map.get("convs.1.weight");
                                model3.f4774n = (d) map.get("convs.2.weight");
                                d dVar = model3.f4772l;
                                float[] fArr = dVar.f4790b;
                                int[] iArr = dVar.f4789a;
                                dVar.f4790b = C0244f.m1027p(fArr, iArr[0], iArr[1], iArr[2]);
                                d dVar2 = model3.f4773m;
                                float[] fArr2 = dVar2.f4790b;
                                int[] iArr2 = dVar2.f4789a;
                                dVar2.f4790b = C0244f.m1027p(fArr2, iArr2[0], iArr2[1], iArr2[2]);
                                d dVar3 = model3.f4774n;
                                float[] fArr3 = dVar3.f4790b;
                                int[] iArr3 = dVar3.f4789a;
                                dVar3.f4790b = C0244f.m1027p(fArr3, iArr3[0], iArr3[1], iArr3[2]);
                                model3.f4775o = (d) map.get("convs.0.bias");
                                model3.f4776p = (d) map.get("convs.1.bias");
                                model3.f4777q = (d) map.get("convs.2.bias");
                                model3.f4778r = (d) map.get("fc1.weight");
                                model3.f4779s = (d) map.get("fc2.weight");
                                model3.f4780t = (d) map.get("fc3.weight");
                                d dVar4 = model3.f4778r;
                                float[] fArr4 = dVar4.f4790b;
                                int[] iArr4 = dVar4.f4789a;
                                dVar4.f4790b = C0244f.m1026o(fArr4, iArr4[0], iArr4[1]);
                                d dVar5 = model3.f4779s;
                                float[] fArr5 = dVar5.f4790b;
                                int[] iArr5 = dVar5.f4789a;
                                dVar5.f4790b = C0244f.m1026o(fArr5, iArr5[0], iArr5[1]);
                                d dVar6 = model3.f4780t;
                                float[] fArr6 = dVar6.f4790b;
                                int[] iArr6 = dVar6.f4789a;
                                dVar6.f4790b = C0244f.m1026o(fArr6, iArr6[0], iArr6[1]);
                                model3.f4781u = (d) map.get("fc1.bias");
                                model3.f4782v = (d) map.get("fc2.bias");
                                model3.f4783w = (d) map.get("fc3.bias");
                                z = true;
                                break;
                            }
                            String str = strArr[i4];
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr7 = new int[length2];
                            int i5 = 1;
                            for (int i6 = 0; i6 < length2; i6++) {
                                iArr7[i6] = jSONArray.getInt(i6);
                                i5 *= iArr7[i6];
                            }
                            int i7 = i5 * 4;
                            int i8 = i2 + i7;
                            if (i8 <= iAvailable) {
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i2, i7);
                                byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                                float[] fArr7 = new float[i5];
                                byteBufferWrap2.asFloatBuffer().get(fArr7, 0, i5);
                                Map<String, String> map2 = Model2.f4762b;
                                if (map2.containsKey(str)) {
                                    str = map2.get(str);
                                }
                                map.put(str, new d(iArr7, fArr7));
                                i4++;
                                i2 = i8;
                            }
                        }
                        if (z) {
                            model2 = Model2.this;
                            runnable = this.f4784f;
                            if (model2.f4765e.exists() && model2.f4770j != null) {
                                new c(model2.f4770j, model2.f4765e, runnable).execute(new String[0]);
                                return;
                            }
                            runnable.run();
                        }
                    }
                }
            } catch (Exception unused) {
            }
            z = false;
            if (z) {
                model2 = Model2.this;
                runnable = this.f4784f;
                if (model2.f4765e.exists()) {
                }
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: c.l.h0.f0.a$c */
    /* JADX INFO: compiled from: Model.java */
    public static class c extends AsyncTask<String, Void, Boolean> {

        /* JADX INFO: renamed from: a */
        public Runnable f4786a;

        /* JADX INFO: renamed from: b */
        public File f4787b;

        /* JADX INFO: renamed from: c */
        public String f4788c;

        public c(String str, File file, Runnable runnable) {
            this.f4788c = str;
            this.f4787b = file;
            this.f4786a = runnable;
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(String[] strArr) {
            try {
                URL url = new URL(this.f4788c);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f4787b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                this.f4786a.run();
            }
        }
    }

    /* JADX INFO: renamed from: c.l.h0.f0.a$d */
    /* JADX INFO: compiled from: Model.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public int[] f4789a;

        /* JADX INFO: renamed from: b */
        public float[] f4790b;

        public d(int[] iArr, float[] fArr) {
            this.f4789a = iArr;
            this.f4790b = fArr;
        }
    }

    public Model2(String str, int i, String str2, String str3, float[] fArr) {
        this.f4763c = str;
        this.f4767g = i;
        this.f4768h = fArr;
        this.f4769i = str2;
        this.f4770j = str3;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        File file = new File(FacebookSdk.f5360i.getFilesDir(), "facebook_ml/");
        this.f4766f = file;
        if (!file.exists()) {
            this.f4766f.mkdirs();
        }
        this.f4764d = new File(this.f4766f, str + "_" + i);
        this.f4765e = new File(this.f4766f, str + "_" + i + "_rule");
    }

    /* JADX INFO: renamed from: a */
    public void m2331a(Runnable runnable) {
        b bVar = new b(runnable);
        if (this.f4764d.exists()) {
            bVar.run();
        } else if (this.f4769i != null) {
            new c(this.f4769i, this.f4764d, bVar).execute(new String[0]);
        }
        File[] fileArrListFiles = this.f4766f.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        String str = this.f4763c + "_" + this.f4767g;
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (name.startsWith(this.f4763c) && !name.startsWith(str)) {
                file.delete();
            }
        }
    }
}
