package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zv0 implements dv1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f22425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aw0 f22426b;

    public zv0(aw0 aw0Var, boolean z) {
        this.f22426b = aw0Var;
        this.f22425a = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        C2622l.m5408n3("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0122  */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(Bundle bundle) {
        List listEmptyList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b;
        Bundle bundle2;
        Bundle bundle3;
        aw0 aw0Var;
        vt2 vt2VarM5852A;
        int i;
        int i2;
        xt2 xt2Var;
        String str;
        vs2 vs2Var;
        Bundle bundle4 = bundle;
        if (this.f22426b.f12472g.mo4811O()) {
            return;
        }
        Object obj = bundle4.get("ad_types");
        if (obj instanceof List) {
            listAsList = (List) obj;
        } else {
            if (obj instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj);
            } else {
                listEmptyList = Collections.emptyList();
            }
            arrayList = new ArrayList();
            it = listEmptyList.iterator();
            while (true) {
                b = 0;
                if (it.hasNext()) {
                    bundle2 = bundle4.getBundle("device");
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    bundle3 = bundle2.getBundle("network");
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    final iu2 iu2Var = aw0.f12466a.get(bundle3.getInt("active_network_state", -1), iu2.UNSPECIFIED);
                    aw0Var = this.f22426b;
                    vt2VarM5852A = au2.m5852A();
                    i = bundle4.getInt("cnt", -2);
                    i2 = bundle4.getInt("gnt", 0);
                    if (i == -1) {
                        aw0Var.f12473h = lt2.ENUM_TRUE;
                    } else {
                        aw0Var.f12473h = lt2.ENUM_FALSE;
                        if (i != 0) {
                            vt2VarM5852A.m8593r(zt2.CELL);
                        } else if (i != 1) {
                            vt2VarM5852A.m8593r(zt2.NETWORKTYPE_UNSPECIFIED);
                        } else {
                            vt2VarM5852A.m8593r(zt2.WIFI);
                        }
                        switch (i2) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                xt2Var = xt2.TWO_G;
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                xt2Var = xt2.THREE_G;
                                break;
                            case 13:
                                xt2Var = xt2.LTE;
                                break;
                            default:
                                xt2Var = xt2.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                                break;
                        }
                        if (vt2VarM5852A.f13191h) {
                            vt2VarM5852A.m6298m();
                            vt2VarM5852A.f13191h = false;
                        }
                        au2.m5856E((au2) vt2VarM5852A.f13190g, xt2Var);
                    }
                    final au2 au2VarM6300o = vt2VarM5852A.m6300o();
                    pv0 pv0Var = this.f22426b.f12471f;
                    final boolean z = this.f22425a;
                    pv0Var.m8164a(new dl1(this, z, arrayList, au2VarM6300o, iu2Var) { // from class: c.n.b.d.j.a.yv0

                        /* JADX INFO: renamed from: a */
                        public final zv0 f22110a;

                        /* JADX INFO: renamed from: b */
                        public final boolean f22111b;

                        /* JADX INFO: renamed from: c */
                        public final ArrayList f22112c;

                        /* JADX INFO: renamed from: d */
                        public final au2 f22113d;

                        /* JADX INFO: renamed from: e */
                        public final iu2 f22114e;

                        {
                            this.f22110a = this;
                            this.f22111b = z;
                            this.f22112c = arrayList;
                            this.f22113d = au2VarM6300o;
                            this.f22114e = iu2Var;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.dl1
                        /* JADX INFO: renamed from: a */
                        public final Object mo5679a(Object obj2) {
                            long j2;
                            long j3;
                            int i3;
                            zv0 zv0Var = this.f22110a;
                            boolean z2 = this.f22111b;
                            ArrayList arrayList2 = this.f22112c;
                            au2 au2Var = this.f22113d;
                            iu2 iu2Var2 = this.f22114e;
                            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                            if (!zv0Var.f22426b.f12472g.mo4811O()) {
                                aw0 aw0Var2 = zv0Var.f22426b;
                                eu2 eu2VarM6863L = fu2.m6863L();
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6869R((fu2) eu2VarM6863L.f13190g, arrayList2);
                                ContentResolver contentResolver = aw0Var2.f12467b.getContentResolver();
                                C2330u c2330u = C2330u.f10884a;
                                lt2 lt2VarM5868a = aw0.m5868a(c2330u.f10891f.mo4717f(contentResolver) != 0);
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6872U((fu2) eu2VarM6863L.f13190g, lt2VarM5868a);
                                lt2 lt2VarMo4727p = c2330u.f10891f.mo4727p(aw0Var2.f12467b, aw0Var2.f12469d);
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6873V((fu2) eu2VarM6863L.f13190g, lt2VarMo4727p);
                                tv0 tv0Var = aw0Var2.f12470e;
                                synchronized (tv0Var.f20082f) {
                                    j2 = tv0Var.f20078b;
                                }
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6867P((fu2) eu2VarM6863L.f13190g, j2);
                                tv0 tv0Var2 = aw0Var2.f12470e;
                                synchronized (tv0Var2) {
                                    synchronized (tv0Var2.f20084h) {
                                        j3 = tv0Var2.f20080d;
                                    }
                                }
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6868Q((fu2) eu2VarM6863L.f13190g, j3);
                                tv0 tv0Var3 = aw0Var2.f12470e;
                                synchronized (tv0Var3.f20081e) {
                                    i3 = tv0Var3.f20077a;
                                }
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6874W((fu2) eu2VarM6863L.f13190g, i3);
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6876x((fu2) eu2VarM6863L.f13190g, iu2Var2);
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6870S((fu2) eu2VarM6863L.f13190g, au2Var);
                                lt2 lt2Var = aw0Var2.f12473h;
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6875v((fu2) eu2VarM6863L.f13190g, lt2Var);
                                lt2 lt2VarM5868a2 = aw0.m5868a(z2);
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6866O((fu2) eu2VarM6863L.f13190g, lt2VarM5868a2);
                                long jMo5623c = c2330u.f10896k.mo5623c();
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6865N((fu2) eu2VarM6863L.f13190g, jMo5623c);
                                lt2 lt2VarM5868a3 = aw0.m5868a(c2330u.f10891f.mo4716e(aw0Var2.f12467b.getContentResolver()) != 0);
                                if (eu2VarM6863L.f13191h) {
                                    eu2VarM6863L.m6298m();
                                    eu2VarM6863L.f13191h = false;
                                }
                                fu2.m6871T((fu2) eu2VarM6863L.f13190g, lt2VarM5868a3);
                                byte[] bArrMo7574w = eu2VarM6863L.m6300o().mo7574w();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("timestamp", Long.valueOf(c2330u.f10896k.mo5623c()));
                                contentValues.put("serialized_proto_data", bArrMo7574w);
                                sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                                if (!z2) {
                                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                                }
                            }
                            return null;
                        }
                    });
                    return;
                }
                str = (String) it.next();
                switch (str.hashCode()) {
                    case -1396342996:
                        if (!str.equals("banner")) {
                            b = -1;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b != 0) {
                    vs2Var = vs2.BANNER;
                } else if (b != 1) {
                    vs2Var = vs2.INTERSTITIAL;
                } else if (b != 2) {
                    vs2Var = vs2.NATIVE_APP_INSTALL;
                } else if (b != 3) {
                    vs2Var = vs2.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    vs2Var = vs2.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(vs2Var);
            }
        }
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj2 : listAsList) {
            if (obj2 instanceof String) {
                arrayList2.add((String) obj2);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listEmptyList.iterator();
        while (true) {
            b = 0;
            if (it.hasNext()) {
                bundle2 = bundle4.getBundle("device");
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle3 = bundle2.getBundle("network");
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                final iu2 iu2Var2 = aw0.f12466a.get(bundle3.getInt("active_network_state", -1), iu2.UNSPECIFIED);
                aw0Var = this.f22426b;
                vt2VarM5852A = au2.m5852A();
                i = bundle4.getInt("cnt", -2);
                i2 = bundle4.getInt("gnt", 0);
                if (i == -1) {
                    aw0Var.f12473h = lt2.ENUM_TRUE;
                } else {
                    aw0Var.f12473h = lt2.ENUM_FALSE;
                    if (i != 0) {
                        vt2VarM5852A.m8593r(zt2.CELL);
                    } else if (i != 1) {
                        vt2VarM5852A.m8593r(zt2.NETWORKTYPE_UNSPECIFIED);
                    } else {
                        vt2VarM5852A.m8593r(zt2.WIFI);
                    }
                    switch (i2) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            xt2Var = xt2.TWO_G;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            xt2Var = xt2.THREE_G;
                            break;
                        case 13:
                            xt2Var = xt2.LTE;
                            break;
                        default:
                            xt2Var = xt2.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                            break;
                    }
                    if (vt2VarM5852A.f13191h) {
                        vt2VarM5852A.m6298m();
                        vt2VarM5852A.f13191h = false;
                    }
                    au2.m5856E((au2) vt2VarM5852A.f13190g, xt2Var);
                }
                final au2 au2VarM6300o2 = vt2VarM5852A.m6300o();
                pv0 pv0Var2 = this.f22426b.f12471f;
                final boolean z2 = this.f22425a;
                pv0Var2.m8164a(new dl1(this, z2, arrayList, au2VarM6300o2, iu2Var2) { // from class: c.n.b.d.j.a.yv0

                    /* JADX INFO: renamed from: a */
                    public final zv0 f22110a;

                    /* JADX INFO: renamed from: b */
                    public final boolean f22111b;

                    /* JADX INFO: renamed from: c */
                    public final ArrayList f22112c;

                    /* JADX INFO: renamed from: d */
                    public final au2 f22113d;

                    /* JADX INFO: renamed from: e */
                    public final iu2 f22114e;

                    {
                        this.f22110a = this;
                        this.f22111b = z2;
                        this.f22112c = arrayList;
                        this.f22113d = au2VarM6300o2;
                        this.f22114e = iu2Var2;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dl1
                    /* JADX INFO: renamed from: a */
                    public final Object mo5679a(Object obj3) {
                        long j2;
                        long j3;
                        int i3;
                        zv0 zv0Var = this.f22110a;
                        boolean z3 = this.f22111b;
                        ArrayList arrayList3 = this.f22112c;
                        au2 au2Var = this.f22113d;
                        iu2 iu2Var3 = this.f22114e;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (!zv0Var.f22426b.f12472g.mo4811O()) {
                            aw0 aw0Var2 = zv0Var.f22426b;
                            eu2 eu2VarM6863L = fu2.m6863L();
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6869R((fu2) eu2VarM6863L.f13190g, arrayList3);
                            ContentResolver contentResolver = aw0Var2.f12467b.getContentResolver();
                            C2330u c2330u = C2330u.f10884a;
                            lt2 lt2VarM5868a = aw0.m5868a(c2330u.f10891f.mo4717f(contentResolver) != 0);
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6872U((fu2) eu2VarM6863L.f13190g, lt2VarM5868a);
                            lt2 lt2VarMo4727p = c2330u.f10891f.mo4727p(aw0Var2.f12467b, aw0Var2.f12469d);
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6873V((fu2) eu2VarM6863L.f13190g, lt2VarMo4727p);
                            tv0 tv0Var = aw0Var2.f12470e;
                            synchronized (tv0Var.f20082f) {
                                j2 = tv0Var.f20078b;
                            }
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6867P((fu2) eu2VarM6863L.f13190g, j2);
                            tv0 tv0Var2 = aw0Var2.f12470e;
                            synchronized (tv0Var2) {
                                synchronized (tv0Var2.f20084h) {
                                    j3 = tv0Var2.f20080d;
                                }
                            }
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6868Q((fu2) eu2VarM6863L.f13190g, j3);
                            tv0 tv0Var3 = aw0Var2.f12470e;
                            synchronized (tv0Var3.f20081e) {
                                i3 = tv0Var3.f20077a;
                            }
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6874W((fu2) eu2VarM6863L.f13190g, i3);
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6876x((fu2) eu2VarM6863L.f13190g, iu2Var3);
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6870S((fu2) eu2VarM6863L.f13190g, au2Var);
                            lt2 lt2Var = aw0Var2.f12473h;
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6875v((fu2) eu2VarM6863L.f13190g, lt2Var);
                            lt2 lt2VarM5868a2 = aw0.m5868a(z3);
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6866O((fu2) eu2VarM6863L.f13190g, lt2VarM5868a2);
                            long jMo5623c = c2330u.f10896k.mo5623c();
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6865N((fu2) eu2VarM6863L.f13190g, jMo5623c);
                            lt2 lt2VarM5868a3 = aw0.m5868a(c2330u.f10891f.mo4716e(aw0Var2.f12467b.getContentResolver()) != 0);
                            if (eu2VarM6863L.f13191h) {
                                eu2VarM6863L.m6298m();
                                eu2VarM6863L.f13191h = false;
                            }
                            fu2.m6871T((fu2) eu2VarM6863L.f13190g, lt2VarM5868a3);
                            byte[] bArrMo7574w = eu2VarM6863L.m6300o().mo7574w();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("timestamp", Long.valueOf(c2330u.f10896k.mo5623c()));
                            contentValues.put("serialized_proto_data", bArrMo7574w);
                            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                            if (!z3) {
                                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                            }
                        }
                        return null;
                    }
                });
                return;
            }
            str = (String) it.next();
            switch (str.hashCode()) {
                case -1396342996:
                    if (!str.equals("banner")) {
                        b = -1;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                vs2Var = vs2.BANNER;
            } else if (b != 1) {
                vs2Var = vs2.INTERSTITIAL;
            } else if (b != 2) {
                vs2Var = vs2.NATIVE_APP_INSTALL;
            } else if (b != 3) {
                vs2Var = vs2.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                vs2Var = vs2.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(vs2Var);
        }
    }
}
