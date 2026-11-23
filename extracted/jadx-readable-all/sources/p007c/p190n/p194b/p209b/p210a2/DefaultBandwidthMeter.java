package p007c.p190n.p194b.p209b.p210a2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Clock2;
import p007c.p190n.p194b.p209b.p212b2.ListenerSet;
import p007c.p190n.p194b.p209b.p212b2.SlidingPercentile;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsCollector;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.ImmutableListMultimap;
import p007c.p190n.p378c.p380b.ImmutableMap;
import p007c.p190n.p378c.p380b.RegularImmutableList;
import p007c.p190n.p378c.p380b.RegularImmutableMap;

/* JADX INFO: renamed from: c.n.b.b.a2.r, reason: use source file name */
/* JADX INFO: compiled from: DefaultBandwidthMeter.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {

    /* JADX INFO: renamed from: a */
    public static final ImmutableListMultimap<String, Integer> f6165a = m3009i();

    /* JADX INFO: renamed from: b */
    public static final ImmutableList2<Long> f6166b = ImmutableList2.m11638C(6100000L, 3800000L, 2100000L, 1300000L, 590000L);

    /* JADX INFO: renamed from: c */
    public static final ImmutableList2<Long> f6167c = ImmutableList2.m11638C(218000L, 159000L, 145000L, 130000L, 112000L);

    /* JADX INFO: renamed from: d */
    public static final ImmutableList2<Long> f6168d = ImmutableList2.m11638C(2200000L, 1300000L, 930000L, 730000L, 530000L);

    /* JADX INFO: renamed from: e */
    public static final ImmutableList2<Long> f6169e = ImmutableList2.m11638C(4800000L, 2700000L, 1800000L, 1200000L, 630000L);

    /* JADX INFO: renamed from: f */
    public static final ImmutableList2<Long> f6170f = ImmutableList2.m11638C(12000000L, 8800000L, 5900000L, 3500000L, 1800000L);

    /* JADX INFO: renamed from: g */
    public static DefaultBandwidthMeter f6171g;

    /* JADX INFO: renamed from: h */
    public final Context f6172h;

    /* JADX INFO: renamed from: i */
    public final ImmutableMap<Integer, Long> f6173i;

    /* JADX INFO: renamed from: j */
    public final BandwidthMeter.a.C8508a f6174j;

    /* JADX INFO: renamed from: k */
    public final SlidingPercentile f6175k;

    /* JADX INFO: renamed from: l */
    public final Clock2 f6176l;

    /* JADX INFO: renamed from: m */
    public int f6177m;

    /* JADX INFO: renamed from: n */
    public long f6178n;

    /* JADX INFO: renamed from: o */
    public long f6179o;

    /* JADX INFO: renamed from: p */
    public int f6180p;

    /* JADX INFO: renamed from: q */
    public long f6181q;

    /* JADX INFO: renamed from: r */
    public long f6182r;

    /* JADX INFO: renamed from: s */
    public long f6183s;

    /* JADX INFO: renamed from: t */
    public long f6184t;

    /* JADX INFO: renamed from: c.n.b.b.a2.r$a */
    /* JADX INFO: compiled from: DefaultBandwidthMeter.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Context f6185a;

        /* JADX INFO: renamed from: b */
        public Map<Integer, Long> f6186b;

        /* JADX INFO: renamed from: c */
        public int f6187c;

        /* JADX INFO: renamed from: d */
        public Clock2 f6188d;

        /* JADX INFO: renamed from: e */
        public boolean f6189e;

        /* JADX WARN: Code duplicated, block: B:15:0x002f  */
        /* JADX WARN: Code duplicated, block: B:18:0x003a  */
        public a(Context context) {
            String country;
            TelephonyManager telephonyManager;
            this.f6185a = context == null ? null : context.getApplicationContext();
            int i = Util6.f6307a;
            if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                country = Locale.getDefault().getCountry();
                if (country != null) {
                    country = country.toUpperCase(Locale.US);
                }
            } else {
                country = telephonyManager.getNetworkCountryIso();
                if (TextUtils.isEmpty(country)) {
                    country = Locale.getDefault().getCountry();
                    if (country != null) {
                        country = country.toUpperCase(Locale.US);
                    }
                } else if (country != null) {
                    country = country.toUpperCase(Locale.US);
                }
            }
            ImmutableList2<Object> immutableList2M11638C = (ImmutableList2) DefaultBandwidthMeter.f6165a.f26275i.get(country);
            if (immutableList2M11638C == null) {
                AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
                immutableList2M11638C = RegularImmutableList.f26218h;
            }
            immutableList2M11638C = immutableList2M11638C.isEmpty() ? ImmutableList2.m11638C(2, 2, 2, 2, 2) : immutableList2M11638C;
            HashMap map = new HashMap(6);
            map.put(0, 1000000L);
            ImmutableList2<Long> immutableList2 = DefaultBandwidthMeter.f6166b;
            map.put(2, immutableList2.get(((Integer) immutableList2M11638C.get(0)).intValue()));
            map.put(3, DefaultBandwidthMeter.f6167c.get(((Integer) immutableList2M11638C.get(1)).intValue()));
            map.put(4, DefaultBandwidthMeter.f6168d.get(((Integer) immutableList2M11638C.get(2)).intValue()));
            map.put(5, DefaultBandwidthMeter.f6169e.get(((Integer) immutableList2M11638C.get(3)).intValue()));
            map.put(9, DefaultBandwidthMeter.f6170f.get(((Integer) immutableList2M11638C.get(4)).intValue()));
            map.put(7, immutableList2.get(((Integer) immutableList2M11638C.get(0)).intValue()));
            this.f6186b = map;
            this.f6187c = 2000;
            this.f6188d = Clock2.f6300a;
            this.f6189e = true;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.r$b */
    /* JADX INFO: compiled from: DefaultBandwidthMeter.java */
    public static class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public static b f6190a;

        /* JADX INFO: renamed from: b */
        public final Handler f6191b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c */
        public final ArrayList<WeakReference<DefaultBandwidthMeter>> f6192c = new ArrayList<>();

        /* JADX INFO: renamed from: a */
        public final void m3013a() {
            for (int size = this.f6192c.size() - 1; size >= 0; size--) {
                if (this.f6192c.get(size).get() == null) {
                    this.f6192c.remove(size);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m3014b(DefaultBandwidthMeter defaultBandwidthMeter) {
            ImmutableListMultimap<String, Integer> immutableListMultimap = DefaultBandwidthMeter.f6165a;
            synchronized (defaultBandwidthMeter) {
                Context context = defaultBandwidthMeter.f6172h;
                int iM3134v = context == null ? 0 : Util6.m3134v(context);
                if (defaultBandwidthMeter.f6180p == iM3134v) {
                    return;
                }
                defaultBandwidthMeter.f6180p = iM3134v;
                if (iM3134v != 1 && iM3134v != 0 && iM3134v != 8) {
                    defaultBandwidthMeter.f6183s = defaultBandwidthMeter.m3011j(iM3134v);
                    long jMo3068a = defaultBandwidthMeter.f6176l.mo3068a();
                    defaultBandwidthMeter.m3012l(defaultBandwidthMeter.f6177m > 0 ? (int) (jMo3068a - defaultBandwidthMeter.f6178n) : 0, defaultBandwidthMeter.f6179o, defaultBandwidthMeter.f6183s);
                    defaultBandwidthMeter.f6178n = jMo3068a;
                    defaultBandwidthMeter.f6179o = 0L;
                    defaultBandwidthMeter.f6182r = 0L;
                    defaultBandwidthMeter.f6181q = 0L;
                    SlidingPercentile slidingPercentile = defaultBandwidthMeter.f6175k;
                    slidingPercentile.f6268c.clear();
                    slidingPercentile.f6270e = -1;
                    slidingPercentile.f6271f = 0;
                    slidingPercentile.f6272g = 0;
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            m3013a();
            for (int i = 0; i < this.f6192c.size(); i++) {
                DefaultBandwidthMeter defaultBandwidthMeter = this.f6192c.get(i).get();
                if (defaultBandwidthMeter != null) {
                    m3014b(defaultBandwidthMeter);
                }
            }
        }
    }

    @Deprecated
    public DefaultBandwidthMeter() {
        this(null, RegularImmutableMap.f26222i, 2000, Clock2.f6300a, false);
    }

    /* JADX INFO: renamed from: i */
    public static ImmutableListMultimap<String, Integer> m3009i() {
        ImmutableListMultimap.a aVarM11648f = ImmutableListMultimap.m11648f();
        aVarM11648f.m11650c("AD", 1, 2, 0, 0, 2);
        aVarM11648f.m11650c("AE", 1, 4, 4, 4, 1);
        aVarM11648f.m11650c("AF", 4, 4, 3, 4, 2);
        aVarM11648f.m11650c("AG", 2, 2, 1, 1, 2);
        aVarM11648f.m11650c("AI", 1, 2, 2, 2, 2);
        aVarM11648f.m11650c("AL", 1, 1, 0, 1, 2);
        aVarM11648f.m11650c("AM", 2, 2, 1, 2, 2);
        aVarM11648f.m11650c("AO", 3, 4, 4, 2, 2);
        aVarM11648f.m11650c("AR", 2, 4, 2, 2, 2);
        aVarM11648f.m11650c("AS", 2, 2, 4, 3, 2);
        aVarM11648f.m11650c("AT", 0, 3, 0, 0, 2);
        aVarM11648f.m11650c("AU", 0, 2, 0, 1, 1);
        aVarM11648f.m11650c("AW", 1, 2, 0, 4, 2);
        aVarM11648f.m11650c("AX", 0, 2, 2, 2, 2);
        aVarM11648f.m11650c("AZ", 3, 3, 3, 4, 2);
        aVarM11648f.m11650c("BA", 1, 1, 0, 1, 2);
        aVarM11648f.m11650c("BB", 0, 2, 0, 0, 2);
        aVarM11648f.m11650c("BD", 2, 0, 3, 3, 2);
        aVarM11648f.m11650c("BE", 0, 1, 2, 3, 2);
        aVarM11648f.m11650c("BF", 4, 4, 4, 2, 2);
        aVarM11648f.m11650c("BG", 0, 1, 0, 0, 2);
        aVarM11648f.m11650c("BH", 1, 0, 2, 4, 2);
        aVarM11648f.m11650c("BI", 4, 4, 4, 4, 2);
        aVarM11648f.m11650c("BJ", 4, 4, 3, 4, 2);
        aVarM11648f.m11650c("BL", 1, 2, 2, 2, 2);
        aVarM11648f.m11650c("BM", 1, 2, 0, 0, 2);
        aVarM11648f.m11650c("BN", 4, 0, 1, 1, 2);
        aVarM11648f.m11650c("BO", 2, 3, 3, 2, 2);
        aVarM11648f.m11650c("BQ", 1, 2, 1, 2, 2);
        aVarM11648f.m11650c("BR", 2, 4, 2, 1, 2);
        aVarM11648f.m11650c("BS", 3, 2, 2, 3, 2);
        aVarM11648f.m11650c("BT", 3, 0, 3, 2, 2);
        aVarM11648f.m11650c("BW", 3, 4, 2, 2, 2);
        aVarM11648f.m11650c("BY", 1, 0, 2, 1, 2);
        aVarM11648f.m11650c("BZ", 2, 2, 2, 1, 2);
        aVarM11648f.m11650c("CA", 0, 3, 1, 2, 3);
        aVarM11648f.m11650c("CD", 4, 3, 2, 2, 2);
        aVarM11648f.m11650c("CF", 4, 2, 2, 2, 2);
        aVarM11648f.m11650c("CG", 3, 4, 1, 1, 2);
        aVarM11648f.m11650c("CH", 0, 1, 0, 0, 0);
        aVarM11648f.m11650c("CI", 3, 3, 3, 3, 2);
        aVarM11648f.m11650c("CK", 3, 2, 1, 0, 2);
        aVarM11648f.m11650c("CL", 1, 1, 2, 3, 2);
        aVarM11648f.m11650c("CM", 3, 4, 3, 2, 2);
        aVarM11648f.m11650c("CN", 2, 2, 2, 1, 3);
        aVarM11648f.m11650c("CO", 2, 4, 3, 2, 2);
        aVarM11648f.m11650c("CR", 2, 3, 4, 4, 2);
        aVarM11648f.m11650c("CU", 4, 4, 2, 1, 2);
        aVarM11648f.m11650c("CV", 2, 3, 3, 3, 2);
        aVarM11648f.m11650c("CW", 1, 2, 0, 0, 2);
        aVarM11648f.m11650c("CY", 1, 2, 0, 0, 2);
        aVarM11648f.m11650c("CZ", 0, 1, 0, 0, 2);
        aVarM11648f.m11650c("DE", 0, 1, 1, 2, 0);
        aVarM11648f.m11650c("DJ", 4, 1, 4, 4, 2);
        aVarM11648f.m11650c("DK", 0, 0, 1, 0, 2);
        aVarM11648f.m11650c("DM", 1, 2, 2, 2, 2);
        aVarM11648f.m11650c("DO", 3, 4, 4, 4, 2);
        aVarM11648f.m11650c("DZ", 3, 2, 4, 4, 2);
        aVarM11648f.m11650c("EC", 2, 4, 3, 2, 2);
        aVarM11648f.m11650c("EE", 0, 0, 0, 0, 2);
        aVarM11648f.m11650c("EG", 3, 4, 2, 1, 2);
        aVarM11648f.m11650c("EH", 2, 2, 2, 2, 2);
        aVarM11648f.m11650c("ER", 4, 2, 2, 2, 2);
        aVarM11648f.m11650c("ES", 0, 1, 2, 1, 2);
        aVarM11648f.m11650c("ET", 4, 4, 4, 1, 2);
        aVarM11648f.m11650c("FI", 0, 0, 1, 0, 0);
        aVarM11648f.m11650c("FJ", 3, 0, 3, 3, 2);
        aVarM11648f.m11650c("FK", 2, 2, 2, 2, 2);
        aVarM11648f.m11650c("FM", 4, 2, 4, 3, 2);
        aVarM11648f.m11650c("FO", 0, 2, 0, 0, 2);
        aVarM11648f.m11650c("FR", 1, 0, 2, 1, 2);
        aVarM11648f.m11650c("GA", 3, 3, 1, 0, 2);
        aVarM11648f.m11650c("GB", 0, 0, 1, 2, 2);
        aVarM11648f.m11650c("GD", 1, 2, 2, 2, 2);
        aVarM11648f.m11650c("GE", 1, 0, 1, 3, 2);
        aVarM11648f.m11650c("GF", 2, 2, 2, 4, 2);
        aVarM11648f.m11650c("GG", 0, 2, 0, 0, 2);
        aVarM11648f.m11650c("GH", 3, 2, 3, 2, 2);
        aVarM11648f.m11650c("GI", 0, 2, 0, 0, 2);
        aVarM11648f.m11650c("GL", 1, 2, 2, 1, 2);
        aVarM11648f.m11650c("GM", 4, 3, 2, 4, 2);
        aVarM11648f.m11650c("GN", 4, 3, 4, 2, 2);
        aVarM11648f.m11650c("GP", 2, 2, 3, 4, 2);
        aVarM11648f.m11650c("GQ", 4, 2, 3, 4, 2);
        aVarM11648f.m11650c("GR", 1, 1, 0, 1, 2);
        aVarM11648f.m11650c("GT", 3, 2, 3, 2, 2);
        aVarM11648f.m11650c("GU", 1, 2, 4, 4, 2);
        aVarM11648f.m11650c("GW", 3, 4, 4, 3, 2);
        aVarM11648f.m11650c("GY", 3, 3, 1, 0, 2);
        aVarM11648f.m11650c("HK", 0, 2, 3, 4, 2);
        aVarM11648f.m11650c("HN", 3, 0, 3, 3, 2);
        aVarM11648f.m11650c("HR", 1, 1, 0, 1, 2);
        aVarM11648f.m11650c("HT", 4, 3, 4, 4, 2);
        aVarM11648f.m11650c("HU", 0, 1, 0, 0, 2);
        aVarM11648f.m11650c("ID", 3, 2, 2, 3, 2);
        aVarM11648f.m11650c("IE", 0, 0, 1, 1, 2);
        aVarM11648f.m11650c("IL", 1, 0, 2, 3, 2);
        aVarM11648f.m11650c("IM", 0, 2, 0, 1, 2);
        aVarM11648f.m11650c("IN", 2, 1, 3, 3, 2);
        aVarM11648f.m11650c("IO", 4, 2, 2, 4, 2);
        aVarM11648f.m11650c("IQ", 3, 2, 4, 3, 2);
        aVarM11648f.m11650c("IR", 4, 2, 3, 4, 2);
        aVarM11648f.m11650c("IS", 0, 2, 0, 0, 2);
        aVarM11648f.m11650c("IT", 0, 0, 1, 1, 2);
        aVarM11648f.m11650c("JE", 2, 2, 0, 2, 2);
        aVarM11648f.m11650c("JM", 3, 3, 4, 4, 2);
        aVarM11648f.m11650c("JO", 1, 2, 1, 1, 2);
        aVarM11648f.m11650c("JP", 0, 2, 0, 1, 3);
        aVarM11648f.m11650c("KE", 3, 4, 2, 2, 2);
        aVarM11648f.m11650c("KG", 1, 0, 2, 2, 2);
        aVarM11648f.m11650c("KH", 2, 0, 4, 3, 2);
        aVarM11648f.m11650c("KI", 4, 2, 3, 1, 2);
        aVarM11648f.m11650c("KM", 4, 2, 2, 3, 2);
        aVarM11648f.m11650c("KN", 1, 2, 2, 2, 2);
        aVarM11648f.m11650c("KP", 4, 2, 2, 2, 2);
        aVarM11648f.m11650c("KR", 0, 2, 1, 1, 1);
        aVarM11648f.m11650c("KW", 2, 3, 1, 1, 1);
        aVarM11648f.m11650c("KY", 1, 2, 0, 0, 2);
        aVarM11648f.m11650c("KZ", 1, 2, 2, 3, 2);
        aVarM11648f.m11650c("LA", 2, 2, 1, 1, 2);
        aVarM11648f.m11650c("LB", 3, 2, 0, 0, 2);
        aVarM11648f.m11650c("LC", 1, 1, 0, 0, 2);
        aVarM11648f.m11650c("LI", 0, 2, 2, 2, 2);
        aVarM11648f.m11650c("LK", 2, 0, 2, 3, 2);
        aVarM11648f.m11650c("LR", 3, 4, 3, 2, 2);
        aVarM11648f.m11650c("LS", 3, 3, 2, 3, 2);
        aVarM11648f.m11650c("LT", 0, 0, 0, 0, 2);
        aVarM11648f.m11650c("LU", 0, 0, 0, 0, 2);
        aVarM11648f.m11650c("LV", 0, 0, 0, 0, 2);
        aVarM11648f.m11650c("LY", 4, 2, 4, 3, 2);
        aVarM11648f.m11650c("MA", 2, 1, 2, 1, 2);
        aVarM11648f.m11650c("MC", 0, 2, 2, 2, 2);
        aVarM11648f.m11650c("MD", 1, 2, 0, 0, 2);
        aVarM11648f.m11650c("ME", 1, 2, 1, 2, 2);
        aVarM11648f.m11650c("MF", 1, 2, 1, 0, 2);
        aVarM11648f.m11650c("MG", 3, 4, 3, 3, 2);
        aVarM11648f.m11650c("MH", 4, 2, 2, 4, 2);
        aVarM11648f.m11650c("MK", 1, 0, 0, 0, 2);
        aVarM11648f.m11650c("ML", 4, 4, 1, 1, 2);
        aVarM11648f.m11650c("MM", 2, 3, 2, 2, 2);
        aVarM11648f.m11650c("MN", 2, 4, 1, 1, 2);
        aVarM11648f.m11650c("MO", 0, 2, 4, 4, 2);
        aVarM11648f.m11650c("MP", 0, 2, 2, 2, 2);
        aVarM11648f.m11650c("MQ", 2, 2, 2, 3, 2);
        aVarM11648f.m11650c("MR", 3, 0, 4, 2, 2);
        aVarM11648f.m11650c("MS", 1, 2, 2, 2, 2);
        aVarM11648f.m11650c("MT", 0, 2, 0, 1, 2);
        aVarM11648f.m11650c("MU", 3, 1, 2, 3, 2);
        aVarM11648f.m11650c("MV", 4, 3, 1, 4, 2);
        aVarM11648f.m11650c("MW", 4, 1, 1, 0, 2);
        aVarM11648f.m11650c("MX", 2, 4, 3, 3, 2);
        aVarM11648f.m11650c("MY", 2, 0, 3, 3, 2);
        aVarM11648f.m11650c("MZ", 3, 3, 2, 3, 2);
        aVarM11648f.m11650c("NA", 4, 3, 2, 2, 2);
        aVarM11648f.m11650c("NC", 2, 0, 4, 4, 2);
        aVarM11648f.m11650c("NE", 4, 4, 4, 4, 2);
        aVarM11648f.m11650c("NF", 2, 2, 2, 2, 2);
        aVarM11648f.m11650c("NG", 3, 3, 2, 2, 2);
        aVarM11648f.m11650c("NI", 3, 1, 4, 4, 2);
        aVarM11648f.m11650c("NL", 0, 2, 4, 2, 0);
        aVarM11648f.m11650c("NO", 0, 1, 1, 0, 2);
        aVarM11648f.m11650c("NP", 2, 0, 4, 3, 2);
        aVarM11648f.m11650c("NR", 4, 2, 3, 1, 2);
        aVarM11648f.m11650c("NU", 4, 2, 2, 2, 2);
        aVarM11648f.m11650c("NZ", 0, 2, 1, 2, 4);
        aVarM11648f.m11650c("OM", 2, 2, 0, 2, 2);
        aVarM11648f.m11650c("PA", 1, 3, 3, 4, 2);
        aVarM11648f.m11650c("PE", 2, 4, 4, 4, 2);
        aVarM11648f.m11650c("PF", 2, 2, 1, 1, 2);
        aVarM11648f.m11650c("PG", 4, 3, 3, 2, 2);
        aVarM11648f.m11650c("PH", 3, 0, 3, 4, 4);
        aVarM11648f.m11650c("PK", 3, 2, 3, 3, 2);
        aVarM11648f.m11650c("PL", 1, 0, 2, 2, 2);
        aVarM11648f.m11650c("PM", 0, 2, 2, 2, 2);
        aVarM11648f.m11650c("PR", 1, 2, 2, 3, 4);
        aVarM11648f.m11650c("PS", 3, 3, 2, 2, 2);
        aVarM11648f.m11650c("PT", 1, 1, 0, 0, 2);
        aVarM11648f.m11650c("PW", 1, 2, 3, 0, 2);
        aVarM11648f.m11650c("PY", 2, 0, 3, 3, 2);
        aVarM11648f.m11650c("QA", 2, 3, 1, 2, 2);
        aVarM11648f.m11650c("RE", 1, 0, 2, 1, 2);
        aVarM11648f.m11650c("RO", 1, 1, 1, 2, 2);
        aVarM11648f.m11650c("RS", 1, 2, 0, 0, 2);
        aVarM11648f.m11650c("RU", 0, 1, 0, 1, 2);
        aVarM11648f.m11650c("RW", 4, 3, 3, 4, 2);
        aVarM11648f.m11650c("SA", 2, 2, 2, 1, 2);
        aVarM11648f.m11650c("SB", 4, 2, 4, 2, 2);
        aVarM11648f.m11650c("SC", 4, 2, 0, 1, 2);
        aVarM11648f.m11650c("SD", 4, 4, 4, 3, 2);
        aVarM11648f.m11650c("SE", 0, 0, 0, 0, 2);
        aVarM11648f.m11650c("SG", 0, 0, 3, 3, 4);
        aVarM11648f.m11650c("SH", 4, 2, 2, 2, 2);
        aVarM11648f.m11650c("SI", 0, 1, 0, 0, 2);
        aVarM11648f.m11650c("SJ", 2, 2, 2, 2, 2);
        aVarM11648f.m11650c("SK", 0, 1, 0, 0, 2);
        aVarM11648f.m11650c("SL", 4, 3, 3, 1, 2);
        aVarM11648f.m11650c("SM", 0, 2, 2, 2, 2);
        aVarM11648f.m11650c("SN", 4, 4, 4, 3, 2);
        aVarM11648f.m11650c("SO", 3, 4, 4, 4, 2);
        aVarM11648f.m11650c("SR", 3, 2, 3, 1, 2);
        aVarM11648f.m11650c("SS", 4, 1, 4, 2, 2);
        aVarM11648f.m11650c("ST", 2, 2, 1, 2, 2);
        aVarM11648f.m11650c("SV", 2, 1, 4, 4, 2);
        aVarM11648f.m11650c("SX", 2, 2, 1, 0, 2);
        aVarM11648f.m11650c("SY", 4, 3, 2, 2, 2);
        aVarM11648f.m11650c("SZ", 3, 4, 3, 4, 2);
        aVarM11648f.m11650c("TC", 1, 2, 1, 0, 2);
        aVarM11648f.m11650c("TD", 4, 4, 4, 4, 2);
        aVarM11648f.m11650c("TG", 3, 2, 1, 0, 2);
        aVarM11648f.m11650c("TH", 1, 3, 4, 3, 0);
        aVarM11648f.m11650c("TJ", 4, 4, 4, 4, 2);
        aVarM11648f.m11650c("TL", 4, 1, 4, 4, 2);
        aVarM11648f.m11650c("TM", 4, 2, 1, 2, 2);
        aVarM11648f.m11650c("TN", 2, 1, 1, 1, 2);
        aVarM11648f.m11650c("TO", 3, 3, 4, 2, 2);
        aVarM11648f.m11650c("TR", 1, 2, 1, 1, 2);
        aVarM11648f.m11650c("TT", 1, 3, 1, 3, 2);
        aVarM11648f.m11650c("TV", 3, 2, 2, 4, 2);
        aVarM11648f.m11650c("TW", 0, 0, 0, 0, 1);
        aVarM11648f.m11650c("TZ", 3, 3, 3, 2, 2);
        aVarM11648f.m11650c("UA", 0, 3, 0, 0, 2);
        aVarM11648f.m11650c("UG", 3, 2, 2, 3, 2);
        aVarM11648f.m11650c("US", 0, 1, 3, 3, 3);
        aVarM11648f.m11650c("UY", 2, 1, 1, 1, 2);
        aVarM11648f.m11650c("UZ", 2, 0, 3, 2, 2);
        aVarM11648f.m11650c("VC", 2, 2, 2, 2, 2);
        aVarM11648f.m11650c("VE", 4, 4, 4, 4, 2);
        aVarM11648f.m11650c("VG", 2, 2, 1, 2, 2);
        aVarM11648f.m11650c("VI", 1, 2, 2, 4, 2);
        aVarM11648f.m11650c("VN", 0, 1, 4, 4, 2);
        aVarM11648f.m11650c("VU", 4, 1, 3, 1, 2);
        aVarM11648f.m11650c("WS", 3, 1, 4, 2, 2);
        aVarM11648f.m11650c("XK", 1, 1, 1, 0, 2);
        aVarM11648f.m11650c("YE", 4, 4, 4, 4, 2);
        aVarM11648f.m11650c("YT", 3, 2, 1, 3, 2);
        aVarM11648f.m11650c("ZA", 2, 3, 2, 2, 2);
        aVarM11648f.m11650c("ZM", 3, 2, 2, 3, 2);
        aVarM11648f.m11650c("ZW", 3, 3, 3, 3, 2);
        return aVarM11648f.m11649b();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3010k(DataSpec dataSpec, boolean z) {
        return z && !dataSpec.m3002c(8);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.TransferListener
    /* JADX INFO: renamed from: a */
    public synchronized void mo2926a(DataSource3 dataSource3, DataSpec dataSpec, boolean z) {
        if (m3010k(dataSpec, z)) {
            C2096e.m4570f(this.f6177m > 0);
            long jMo3068a = this.f6176l.mo3068a();
            int i = (int) (jMo3068a - this.f6178n);
            this.f6181q += (long) i;
            long j2 = this.f6182r;
            long j3 = this.f6179o;
            this.f6182r = j2 + j3;
            if (i > 0) {
                this.f6175k.m3057a((int) Math.sqrt(j3), (j3 * 8000.0f) / i);
                if (this.f6181q >= 2000 || this.f6182r >= 524288) {
                    this.f6183s = (long) this.f6175k.m3058b(0.5f);
                }
                m3012l(i, this.f6179o, this.f6183s);
                this.f6178n = jMo3068a;
                this.f6179o = 0L;
            }
            this.f6177m--;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.TransferListener
    /* JADX INFO: renamed from: b */
    public synchronized void mo2927b(DataSource3 dataSource3, DataSpec dataSpec, boolean z) {
        if (m3010k(dataSpec, z)) {
            if (this.f6177m == 0) {
                this.f6178n = this.f6176l.mo3068a();
            }
            this.f6177m++;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.BandwidthMeter
    /* JADX INFO: renamed from: c */
    public TransferListener mo2917c() {
        return this;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.BandwidthMeter
    /* JADX INFO: renamed from: d */
    public void mo2918d(BandwidthMeter.a aVar) {
        this.f6174j.m2921a(aVar);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.BandwidthMeter
    /* JADX INFO: renamed from: e */
    public synchronized long mo2919e() {
        return this.f6183s;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.TransferListener
    /* JADX INFO: renamed from: f */
    public synchronized void mo2928f(DataSource3 dataSource3, DataSpec dataSpec, boolean z, int i) {
        if (m3010k(dataSpec, z)) {
            this.f6179o += (long) i;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.BandwidthMeter
    /* JADX INFO: renamed from: g */
    public void mo2920g(Handler handler, BandwidthMeter.a aVar) {
        BandwidthMeter.a.C8508a c8508a = this.f6174j;
        Objects.requireNonNull(c8508a);
        c8508a.m2921a(aVar);
        c8508a.f5992a.add(new BandwidthMeter.a.C8508a.C8509a(handler, aVar));
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.TransferListener
    /* JADX INFO: renamed from: h */
    public void mo2929h(DataSource3 dataSource3, DataSpec dataSpec, boolean z) {
    }

    /* JADX INFO: renamed from: j */
    public final long m3011j(int i) {
        Long l = this.f6173i.get(Integer.valueOf(i));
        if (l == null) {
            l = this.f6173i.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* JADX INFO: renamed from: l */
    public final void m3012l(final int i, final long j2, final long j3) {
        if (i == 0 && j2 == 0 && j3 == this.f6184t) {
            return;
        }
        this.f6184t = j3;
        for (final BandwidthMeter.a.C8508a.C8509a c8509a : this.f6174j.f5992a) {
            if (!c8509a.f5995c) {
                c8509a.f5993a.post(new Runnable() { // from class: c.n.b.b.a2.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BandwidthMeter.a.C8508a.C8509a c8509a2 = c8509a;
                        final int i2 = i;
                        final long j4 = j2;
                        final long j5 = j3;
                        AnalyticsCollector analyticsCollector = (AnalyticsCollector) c8509a2.f5994b;
                        AnalyticsCollector.a aVar = analyticsCollector.f6900i;
                        final AnalyticsListener2.a aVarM3502c0 = analyticsCollector.m3502c0(aVar.f6906b.isEmpty() ? null : (MediaSource2.a) C4799a.m10965P(aVar.f6906b));
                        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.k
                            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                            /* JADX INFO: renamed from: b */
                            public final void mo2881b(Object obj) {
                                ((AnalyticsListener2) obj).mo1058c(aVarM3502c0, i2, j4, j5);
                            }
                        };
                        analyticsCollector.f6901j.put(CloseCodes.CLOSED_ABNORMALLY, aVarM3502c0);
                        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = analyticsCollector.f6902k;
                        listenerSet.m3149b(CloseCodes.CLOSED_ABNORMALLY, aVar2);
                        listenerSet.m3148a();
                    }
                });
            }
        }
    }

    public DefaultBandwidthMeter(Context context, Map<Integer, Long> map, int i, Clock2 clock2, boolean z) {
        final b bVar;
        this.f6172h = context == null ? null : context.getApplicationContext();
        this.f6173i = ImmutableMap.m11651a(map);
        this.f6174j = new BandwidthMeter.a.C8508a();
        this.f6175k = new SlidingPercentile(i);
        this.f6176l = clock2;
        int iM3134v = context == null ? 0 : Util6.m3134v(context);
        this.f6180p = iM3134v;
        this.f6183s = m3011j(iM3134v);
        if (context == null || !z) {
            return;
        }
        b bVar2 = b.f6190a;
        synchronized (b.class) {
            if (b.f6190a == null) {
                b.f6190a = new b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(b.f6190a, intentFilter);
            }
            bVar = b.f6190a;
        }
        synchronized (bVar) {
            bVar.m3013a();
            bVar.f6192c.add(new WeakReference<>(this));
            bVar.f6191b.post(new Runnable() { // from class: c.n.b.b.a2.b
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.m3014b(this);
                }
            });
        }
    }
}
