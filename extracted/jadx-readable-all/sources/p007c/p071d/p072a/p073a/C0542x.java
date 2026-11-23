package p007c.p071d.p072a.p073a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;

/* JADX INFO: renamed from: c.d.a.a.x */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0542x extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0525i f2778a;

    /* JADX INFO: renamed from: b */
    public boolean f2779b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0543y f2780c;

    public /* synthetic */ C0542x(C0543y c0543y, InterfaceC0525i interfaceC0525i) {
        this.f2780c = c0543y;
        this.f2778a = interfaceC0525i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C0519f c0519fM10351c = C4437a.m10351c(intent, "BillingBroadcastManager");
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            ArrayList arrayList2 = new ArrayList();
            if (stringArrayList == null || stringArrayList2 == null) {
                C4437a.m10350b("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
                Purchase purchaseM10355g = C4437a.m10355g(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                if (purchaseM10355g == null) {
                    C4437a.m10350b("BillingHelper", "Couldn't find single purchase data as well.");
                } else {
                    arrayList2.add(purchaseM10355g);
                }
            } else {
                for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                    Purchase purchaseM10355g2 = C4437a.m10355g(stringArrayList.get(i), stringArrayList2.get(i));
                    if (purchaseM10355g2 != null) {
                        arrayList2.add(purchaseM10355g2);
                    }
                }
            }
            arrayList = arrayList2;
        }
        this.f2778a.mo1543a(c0519fM10351c, arrayList);
    }
}
