package p007c.p190n.p194b.p195a.p196i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p195a.Encoding;
import p007c.p190n.p194b.p195a.p196i.p197f.AutoBatchedLogRequestEncoder;
import p007c.p190n.p194b.p195a.p196i.p197f.AutoValue_AndroidClientInfo;
import p007c.p190n.p194b.p195a.p196i.p197f.AutoValue_BatchedLogRequest;
import p007c.p190n.p194b.p195a.p196i.p197f.AutoValue_ClientInfo;
import p007c.p190n.p194b.p195a.p196i.p197f.AutoValue_LogEvent;
import p007c.p190n.p194b.p195a.p196i.p197f.AutoValue_LogRequest;
import p007c.p190n.p194b.p195a.p196i.p197f.AutoValue_NetworkConnectionInfo;
import p007c.p190n.p194b.p195a.p196i.p197f.BatchedLogRequest;
import p007c.p190n.p194b.p195a.p196i.p197f.ClientInfo;
import p007c.p190n.p194b.p195a.p196i.p197f.NetworkConnectionInfo;
import p007c.p190n.p194b.p195a.p196i.p197f.QosTier;
import p007c.p190n.p194b.p195a.p198j.EncodedPayload;
import p007c.p190n.p194b.p195a.p198j.EventInternal;
import p007c.p190n.p194b.p195a.p198j.p199s.AutoValue_BackendRequest;
import p007c.p190n.p194b.p195a.p198j.p199s.AutoValue_BackendResponse;
import p007c.p190n.p194b.p195a.p198j.p199s.BackendRequest;
import p007c.p190n.p194b.p195a.p198j.p199s.BackendResponse;
import p007c.p190n.p194b.p195a.p198j.p199s.TransportBackend;
import p007c.p190n.p194b.p195a.p198j.p202u.RetryStrategy;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;
import p007c.p190n.p385d.p413o.DataEncoder;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder4;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder5;

/* JADX INFO: renamed from: c.n.b.a.i.d, reason: use source file name */
/* JADX INFO: compiled from: CctTransportBackend.java */
/* JADX INFO: loaded from: classes.dex */
public final class CctTransportBackend3 implements TransportBackend {

    /* JADX INFO: renamed from: a */
    public final DataEncoder f5530a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f5531b;

    /* JADX INFO: renamed from: c */
    public final Context f5532c;

    /* JADX INFO: renamed from: d */
    public final URL f5533d;

    /* JADX INFO: renamed from: e */
    public final Clock f5534e;

    /* JADX INFO: renamed from: f */
    public final Clock f5535f;

    /* JADX INFO: renamed from: g */
    public final int f5536g;

    /* JADX INFO: renamed from: c.n.b.a.i.d$a */
    /* JADX INFO: compiled from: CctTransportBackend.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final URL f5537a;

        /* JADX INFO: renamed from: b */
        public final BatchedLogRequest f5538b;

        /* JADX INFO: renamed from: c */
        public final String f5539c;

        public a(URL url, BatchedLogRequest batchedLogRequest, String str) {
            this.f5537a = url;
            this.f5538b = batchedLogRequest;
            this.f5539c = str;
        }
    }

    /* JADX INFO: renamed from: c.n.b.a.i.d$b */
    /* JADX INFO: compiled from: CctTransportBackend.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f5540a;

        /* JADX INFO: renamed from: b */
        public final URL f5541b;

        /* JADX INFO: renamed from: c */
        public final long f5542c;

        public b(int i, URL url, long j2) {
            this.f5540a = i;
            this.f5541b = url;
            this.f5542c = j2;
        }
    }

    public CctTransportBackend3(Context context, Clock clock, Clock clock2) {
        JsonDataEncoderBuilder5 jsonDataEncoderBuilder5 = new JsonDataEncoderBuilder5();
        ((AutoBatchedLogRequestEncoder) AutoBatchedLogRequestEncoder.f5543a).m2771a(jsonDataEncoderBuilder5);
        jsonDataEncoderBuilder5.f27025e = true;
        this.f5530a = new JsonDataEncoderBuilder4(jsonDataEncoderBuilder5);
        this.f5532c = context;
        this.f5531b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5533d = m2755c(CCTDestination.f5520a);
        this.f5534e = clock2;
        this.f5535f = clock;
        this.f5536g = 40000;
    }

    /* JADX INFO: renamed from: c */
    public static URL m2755c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(outline.m1599u("Invalid url: ", str), e);
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.TransportBackend
    /* JADX INFO: renamed from: a */
    public BackendResponse mo2756a(BackendRequest backendRequest) {
        BackendResponse.a aVar;
        ArrayList arrayList;
        Iterator it;
        String strM1599u;
        AutoValue_LogEvent.b bVar;
        BackendResponse.a aVar2 = BackendResponse.a.TRANSIENT_ERROR;
        HashMap map = new HashMap();
        AutoValue_BackendRequest autoValue_BackendRequest = (AutoValue_BackendRequest) backendRequest;
        for (EventInternal eventInternal : autoValue_BackendRequest.f5759a) {
            String strMo2798g = eventInternal.mo2798g();
            if (map.containsKey(strMo2798g)) {
                ((List) map.get(strMo2798g)).add(eventInternal);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(eventInternal);
                map.put(strMo2798g, arrayList2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            AutoValue_LogRequest.b bVar2 = new AutoValue_LogRequest.b();
            bVar2.f5637g = QosTier.DEFAULT;
            bVar2.f5631a = Long.valueOf(this.f5535f.mo2878a());
            bVar2.f5632b = Long.valueOf(this.f5534e.mo2878a());
            AutoValue_ClientInfo.b bVar3 = new AutoValue_ClientInfo.b();
            bVar3.f5608a = ClientInfo.b.ANDROID_FIREBASE;
            AutoValue_AndroidClientInfo.b bVar4 = new AutoValue_AndroidClientInfo.b();
            bVar4.f5593a = Integer.valueOf(eventInternal2.m2816f("sdk-version"));
            bVar4.f5594b = eventInternal2.m2815a("model");
            bVar4.f5595c = eventInternal2.m2815a("hardware");
            bVar4.f5596d = eventInternal2.m2815a("device");
            bVar4.f5597e = eventInternal2.m2815a("product");
            bVar4.f5598f = eventInternal2.m2815a("os-uild");
            bVar4.f5599g = eventInternal2.m2815a("manufacturer");
            bVar4.f5600h = eventInternal2.m2815a("fingerprint");
            bVar4.f5602j = eventInternal2.m2815a("country");
            bVar4.f5601i = eventInternal2.m2815a("locale");
            bVar4.f5603k = eventInternal2.m2815a("mcc_mnc");
            String strM2815a = eventInternal2.m2815a("application_build");
            bVar4.f5604l = strM2815a;
            Iterator it3 = it2;
            BackendResponse.a aVar3 = aVar2;
            AutoValue_BackendRequest autoValue_BackendRequest2 = autoValue_BackendRequest;
            ArrayList arrayList4 = arrayList3;
            AutoValue_AndroidClientInfo autoValue_AndroidClientInfo = new AutoValue_AndroidClientInfo(bVar4.f5593a, bVar4.f5594b, bVar4.f5595c, bVar4.f5596d, bVar4.f5597e, bVar4.f5598f, bVar4.f5599g, bVar4.f5600h, bVar4.f5601i, bVar4.f5602j, bVar4.f5603k, strM2815a, null);
            bVar3.f5609b = autoValue_AndroidClientInfo;
            bVar2.f5633c = new AutoValue_ClientInfo(bVar3.f5608a, autoValue_AndroidClientInfo, null);
            try {
                bVar2.f5634d = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                while (true) {
                    if (it.hasNext()) {
                        EventInternal eventInternal3 = (EventInternal) it.next();
                        EncodedPayload encodedPayloadMo2796d = eventInternal3.mo2796d();
                        Encoding encoding = encodedPayloadMo2796d.f5735a;
                        if (encoding.equals(new Encoding("proto"))) {
                            byte[] bArr = encodedPayloadMo2796d.f5736b;
                            bVar = new AutoValue_LogEvent.b();
                            bVar.f5620d = bArr;
                        } else if (encoding.equals(new Encoding("json"))) {
                            String str = new String(encodedPayloadMo2796d.f5736b, Charset.forName(Utf8Charset.NAME));
                            AutoValue_LogEvent.b bVar5 = new AutoValue_LogEvent.b();
                            bVar5.f5621e = str;
                            bVar = bVar5;
                        } else {
                            Log.w(C1095a.m2400p("CctTransportBackend"), String.format("Received event of unsupported encoding %s. Skipping...", encoding));
                        }
                        bVar.f5617a = Long.valueOf(eventInternal3.mo2797e());
                        bVar.f5619c = Long.valueOf(eventInternal3.mo2799h());
                        String str2 = eventInternal3.mo2794b().get("tz-offset");
                        bVar.f5622f = Long.valueOf(str2 == null ? 0L : Long.valueOf(str2).longValue());
                        AutoValue_NetworkConnectionInfo.b bVar6 = new AutoValue_NetworkConnectionInfo.b();
                        bVar6.f5641a = NetworkConnectionInfo.c.f5689y.get(eventInternal3.m2816f("net-type"));
                        NetworkConnectionInfo.b bVar7 = NetworkConnectionInfo.b.f5646A.get(eventInternal3.m2816f("mobile-subtype"));
                        bVar6.f5642b = bVar7;
                        bVar.f5623g = new AutoValue_NetworkConnectionInfo(bVar6.f5641a, bVar7, null);
                        if (eventInternal3.mo2795c() != null) {
                            bVar.f5618b = eventInternal3.mo2795c();
                        }
                        strM1599u = bVar.f5617a == null ? " eventTimeMs" : "";
                        if (bVar.f5619c == null) {
                            strM1599u = outline.m1599u(strM1599u, " eventUptimeMs");
                        }
                        if (bVar.f5622f == null) {
                            strM1599u = outline.m1599u(strM1599u, " timezoneOffsetSeconds");
                        }
                        if (!strM1599u.isEmpty()) {
                            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
                        }
                        arrayList.add(new AutoValue_LogEvent(bVar.f5617a.longValue(), bVar.f5618b, bVar.f5619c.longValue(), bVar.f5620d, bVar.f5621e, bVar.f5622f.longValue(), bVar.f5623g, null));
                    }
                }
            } catch (NumberFormatException unused) {
                bVar2.f5635e = (String) entry.getKey();
            }
            arrayList = new ArrayList();
            it = ((List) entry.getValue()).iterator();
            bVar2.f5636f = arrayList;
            strM1599u = bVar2.f5631a == null ? " requestTimeMs" : "";
            if (bVar2.f5632b == null) {
                strM1599u = outline.m1599u(strM1599u, " requestUptimeMs");
            }
            if (!strM1599u.isEmpty()) {
                throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
            }
            arrayList4.add(new AutoValue_LogRequest(bVar2.f5631a.longValue(), bVar2.f5632b.longValue(), bVar2.f5633c, bVar2.f5634d, bVar2.f5635e, bVar2.f5636f, bVar2.f5637g, null));
            arrayList3 = arrayList4;
            it2 = it3;
            aVar2 = aVar3;
            autoValue_BackendRequest = autoValue_BackendRequest2;
        }
        BackendResponse.a aVar4 = aVar2;
        AutoValue_BackendRequest autoValue_BackendRequest3 = autoValue_BackendRequest;
        String str3 = null;
        AutoValue_BatchedLogRequest autoValue_BatchedLogRequest = new AutoValue_BatchedLogRequest(arrayList3);
        URL urlM2755c = this.f5533d;
        if (autoValue_BackendRequest3.f5760b != null) {
            try {
                CCTDestination cCTDestinationM2752a = CCTDestination.m2752a(((AutoValue_BackendRequest) backendRequest).f5760b);
                String str4 = cCTDestinationM2752a.f5527h;
                str3 = str4 != null ? str4 : null;
                String str5 = cCTDestinationM2752a.f5526g;
                if (str5 != null) {
                    urlM2755c = m2755c(str5);
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.m2832a();
            }
        }
        try {
            b bVar8 = (b) C1095a.m2378E(5, new a(urlM2755c, autoValue_BatchedLogRequest, str3), new CctTransportBackend(this), new RetryStrategy() { // from class: c.n.b.a.i.c
            });
            int i = bVar8.f5540a;
            if (i == 200) {
                return new AutoValue_BackendResponse(BackendResponse.a.OK, bVar8.f5542c);
            }
            if (i < 500 && i != 404) {
                return BackendResponse.m2832a();
            }
            aVar = aVar4;
            try {
                return new AutoValue_BackendResponse(aVar, -1L);
            } catch (IOException e) {
                e = e;
                C1095a.m2399o("CctTransportBackend", "Could not make request to the backend", e);
                return new AutoValue_BackendResponse(aVar, -1L);
            }
        } catch (IOException e2) {
            e = e2;
            aVar = aVar4;
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.TransportBackend
    /* JADX INFO: renamed from: b */
    public EventInternal mo2757b(EventInternal eventInternal) {
        int type;
        int subtype;
        NetworkInfo activeNetworkInfo = this.f5531b.getActiveNetworkInfo();
        EventInternal.a aVarM2817i = eventInternal.m2817i();
        aVarM2817i.mo2801c().put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        aVarM2817i.mo2801c().put("model", Build.MODEL);
        aVarM2817i.mo2801c().put("hardware", Build.HARDWARE);
        aVarM2817i.mo2801c().put("device", Build.DEVICE);
        aVarM2817i.mo2801c().put("product", Build.PRODUCT);
        aVarM2817i.mo2801c().put("os-uild", Build.ID);
        aVarM2817i.mo2801c().put("manufacturer", Build.MANUFACTURER);
        aVarM2817i.mo2801c().put("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        aVarM2817i.mo2801c().put("tz-offset", String.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / CloseCodes.NORMAL_CLOSURE));
        int i = -1;
        if (activeNetworkInfo == null) {
            NetworkConnectionInfo.c cVar = NetworkConnectionInfo.c.NONE;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        aVarM2817i.mo2801c().put("net-type", String.valueOf(type));
        try {
            if (activeNetworkInfo != null) {
                subtype = activeNetworkInfo.getSubtype();
                if (subtype == -1) {
                    NetworkConnectionInfo.b bVar = NetworkConnectionInfo.b.COMBINED;
                    subtype = 100;
                } else if (NetworkConnectionInfo.b.f5646A.get(subtype) == null) {
                }
                aVarM2817i.mo2801c().put("mobile-subtype", String.valueOf(subtype));
                aVarM2817i.mo2801c().put("country", Locale.getDefault().getCountry());
                aVarM2817i.mo2801c().put("locale", Locale.getDefault().getLanguage());
                aVarM2817i.mo2801c().put("mcc_mnc", ((TelephonyManager) this.f5532c.getSystemService("phone")).getSimOperator());
                Context context = this.f5532c;
                i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                aVarM2817i.mo2801c().put("application_build", Integer.toString(i));
                return aVarM2817i.mo2800b();
            }
            NetworkConnectionInfo.b bVar2 = NetworkConnectionInfo.b.UNKNOWN_MOBILE_SUBTYPE;
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C1095a.m2399o("CctTransportBackend", "Unable to find version code for package", e);
        }
        subtype = 0;
        aVarM2817i.mo2801c().put("mobile-subtype", String.valueOf(subtype));
        aVarM2817i.mo2801c().put("country", Locale.getDefault().getCountry());
        aVarM2817i.mo2801c().put("locale", Locale.getDefault().getLanguage());
        aVarM2817i.mo2801c().put("mcc_mnc", ((TelephonyManager) this.f5532c.getSystemService("phone")).getSimOperator());
        Context context2 = this.f5532c;
        aVarM2817i.mo2801c().put("application_build", Integer.toString(i));
        return aVarM2817i.mo2800b();
    }
}
