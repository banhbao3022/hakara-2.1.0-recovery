package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.AbstractBinderC2263g0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p636z0.p709j0.Configuration;
import p636z0.p709j0.Constraints2;
import p636z0.p709j0.Data;
import p636z0.p709j0.NetworkType;
import p636z0.p709j0.OneTimeWorkRequest;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p720t.CancelWorkRunnable2;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends AbstractBinderC2263g0 {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2266h0
    public final boolean zze(@RecentlyNonNull InterfaceC2799a interfaceC2799a, @RecentlyNonNull String str, @RecentlyNonNull String str2) throws Throwable {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        try {
            WorkManagerImpl.m15915c(context.getApplicationContext(), new Configuration(new Configuration.a()));
        } catch (IllegalStateException unused) {
        }
        Constraints2.a aVar = new Constraints2.a();
        aVar.f37251a = NetworkType.CONNECTED;
        Constraints2 constraints2 = new Constraints2(aVar);
        Data.a aVar2 = new Data.a();
        aVar2.f37261a.put("uri", str);
        aVar2.f37261a.put("gws_query_id", str2);
        Data dataM15881a = aVar2.m15881a();
        OneTimeWorkRequest.a aVar3 = new OneTimeWorkRequest.a(OfflineNotificationPoster.class);
        WorkSpec workSpec = aVar3.f37293b;
        workSpec.f37533j = constraints2;
        workSpec.f37528e = dataM15881a;
        aVar3.f37294c.add("offline_notification_work");
        try {
            WorkManagerImpl.m15914b(context).m15893a(aVar3.m15895a());
            return true;
        } catch (IllegalStateException e) {
            C2622l.m5241D3("Failed to instantiate WorkManager.", e);
            return false;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2266h0
    public final void zzf(@RecentlyNonNull InterfaceC2799a interfaceC2799a) {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        try {
            WorkManagerImpl.m15915c(context.getApplicationContext(), new Configuration(new Configuration.a()));
        } catch (IllegalStateException unused) {
        }
        try {
            WorkManagerImpl workManagerImplM15914b = WorkManagerImpl.m15914b(context);
            Objects.requireNonNull(workManagerImplM15914b);
            ((WorkManagerTaskExecutor) workManagerImplM15914b.f37343h).f37639a.execute(new CancelWorkRunnable2(workManagerImplM15914b, "offline_ping_sender_work"));
            Constraints2.a aVar = new Constraints2.a();
            aVar.f37251a = NetworkType.CONNECTED;
            Constraints2 constraints2 = new Constraints2(aVar);
            OneTimeWorkRequest.a aVar2 = new OneTimeWorkRequest.a(OfflinePingSender.class);
            aVar2.f37293b.f37533j = constraints2;
            aVar2.f37294c.add("offline_ping_sender_work");
            workManagerImplM15914b.m15893a(aVar2.m15895a());
        } catch (IllegalStateException e) {
            C2622l.m5241D3("Failed to instantiate WorkManager.", e);
        }
    }
}
