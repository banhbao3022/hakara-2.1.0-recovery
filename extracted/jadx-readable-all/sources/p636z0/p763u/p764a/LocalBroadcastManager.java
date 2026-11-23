package p636z0.p763u.p764a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: z0.u.a.a, reason: use source file name */
/* JADX INFO: compiled from: LocalBroadcastManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class LocalBroadcastManager {

    /* JADX INFO: renamed from: a */
    public static final Object f38777a = new Object();

    /* JADX INFO: renamed from: b */
    public static LocalBroadcastManager f38778b;

    /* JADX INFO: renamed from: c */
    public final Context f38779c;

    /* JADX INFO: renamed from: d */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f38780d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public final HashMap<String, ArrayList<c>> f38781e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public final ArrayList<b> f38782f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public final Handler f38783g;

    /* JADX INFO: renamed from: z0.u.a.a$a */
    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.this;
            while (true) {
                synchronized (localBroadcastManager.f38780d) {
                    size = localBroadcastManager.f38782f.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    localBroadcastManager.f38782f.toArray(bVarArr);
                    localBroadcastManager.f38782f.clear();
                }
                for (int i = 0; i < size; i++) {
                    b bVar = bVarArr[i];
                    int size2 = bVar.f38786b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        c cVar = bVar.f38786b.get(i2);
                        if (!cVar.f38790d) {
                            cVar.f38788b.onReceive(localBroadcastManager.f38779c, bVar.f38785a);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.u.a.a$b */
    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Intent f38785a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<c> f38786b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f38785a = intent;
            this.f38786b = arrayList;
        }
    }

    /* JADX INFO: renamed from: z0.u.a.a$c */
    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final IntentFilter f38787a;

        /* JADX INFO: renamed from: b */
        public final BroadcastReceiver f38788b;

        /* JADX INFO: renamed from: c */
        public boolean f38789c;

        /* JADX INFO: renamed from: d */
        public boolean f38790d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f38787a = intentFilter;
            this.f38788b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f38788b);
            sb.append(" filter=");
            sb.append(this.f38787a);
            if (this.f38790d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public LocalBroadcastManager(Context context) {
        this.f38779c = context;
        this.f38783g = new a(context.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static LocalBroadcastManager m16762a(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (f38777a) {
            if (f38778b == null) {
                f38778b = new LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = f38778b;
        }
        return localBroadcastManager;
    }

    /* JADX INFO: renamed from: b */
    public void m16763b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f38780d) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f38780d.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f38780d.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<c> arrayList2 = this.f38781e.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f38781e.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m16764c(Intent intent) {
        boolean z;
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        String str3;
        synchronized (this.f38780d) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f38779c.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z2 = (intent.getFlags() & 8) != 0;
            if (z2) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f38781e.get(intent.getAction());
            if (arrayList3 != null) {
                if (z2) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    c cVar = arrayList3.get(i2);
                    if (z2) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f38787a);
                    }
                    if (cVar.f38789c) {
                        if (z2) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = cVar.f38787a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z2) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f38789c = true;
                        } else if (z2) {
                            if (iMatch == -4) {
                                str3 = "category";
                            } else if (iMatch == -3) {
                                str3 = "action";
                            } else if (iMatch != -2) {
                                str3 = iMatch != -1 ? "unknown reason" : "type";
                            } else {
                                str3 = "data";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str3);
                        }
                        i2 = i + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                z = false;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((c) arrayList5.get(i3)).f38789c = false;
                    }
                    this.f38782f.add(new b(intent, arrayList5));
                    if (!this.f38783g.hasMessages(1)) {
                        this.f38783g.sendEmptyMessage(1);
                    }
                    return true;
                }
            } else {
                z = false;
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m16765d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f38780d) {
            ArrayList<c> arrayListRemove = this.f38780d.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                c cVar = arrayListRemove.get(size);
                cVar.f38790d = true;
                for (int i = 0; i < cVar.f38787a.countActions(); i++) {
                    String action = cVar.f38787a.getAction(i);
                    ArrayList<c> arrayList = this.f38781e.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f38788b == broadcastReceiver) {
                                cVar2.f38790d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f38781e.remove(action);
                        }
                    }
                }
            }
        }
    }
}
