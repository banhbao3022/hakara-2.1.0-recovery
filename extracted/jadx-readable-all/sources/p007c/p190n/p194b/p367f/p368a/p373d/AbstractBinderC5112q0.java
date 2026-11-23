package p007c.p190n.p194b.p367f.p368a.p373d;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import p007c.p190n.p194b.p367f.p368a.p370b.BinderC5071z;
import p007c.p190n.p194b.p367f.p368a.p370b.C5056u;

/* JADX INFO: renamed from: c.n.b.f.a.d.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC5112q0 extends BinderC5098j0 implements IInterface {
    public AbstractBinderC5112q0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.BinderC5098j0
    /* JADX INFO: renamed from: E0 */
    public final boolean mo11528E0(int i, Parcel parcel) throws RemoteException {
        InterfaceC5116s0 c5114r0;
        ComponentName componentNameStartForegroundService = null;
        InterfaceC5116s0 c5114r1 = null;
        if (i == 2) {
            Bundle bundle = (Bundle) C5100k0.m11539a(parcel, Bundle.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c5114r0 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                c5114r0 = iInterfaceQueryLocalInterface instanceof InterfaceC5116s0 ? (InterfaceC5116s0) iInterfaceQueryLocalInterface : new C5114r0(strongBinder);
            }
            BinderC5071z binderC5071z = (BinderC5071z) this;
            binderC5071z.f26027f.m11533b(3, "updateServiceState AIDL call", new Object[0]);
            if (C5115s.m11555a(binderC5071z.f26028g) && C5115s.m11556b(binderC5071z.f26028g)) {
                synchronized (binderC5071z) {
                    Intent intent = new Intent(binderC5071z.f26028g, (Class<?>) ExtractionForegroundService.class);
                    int i2 = bundle.getInt("action_type");
                    intent.putExtra("action_type", i2);
                    if (i2 == 1) {
                        intent.putExtra("notification_channel_name", bundle.getString("notification_channel_name"));
                        intent.putExtra("notification_title", bundle.getString("notification_title"));
                        intent.putExtra("notification_subtext", bundle.getString("notification_subtext"));
                        intent.putExtra("notification_timeout", bundle.getLong("notification_timeout"));
                        Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                        if (parcelable instanceof PendingIntent) {
                            intent.putExtra("notification_on_click_intent", parcelable);
                        }
                        intent.putExtra("notification_color", bundle.getInt("notification_color"));
                    }
                    try {
                        componentNameStartForegroundService = Build.VERSION.SDK_INT >= 26 ? binderC5071z.f26028g.startForegroundService(intent) : binderC5071z.f26028g.startService(intent);
                    } catch (IllegalStateException | SecurityException e) {
                        binderC5071z.f26027f.m11532a(e, "Failed starting installation service.", new Object[0]);
                    }
                    if (componentNameStartForegroundService == null) {
                        binderC5071z.f26027f.m11533b(6, "Failed starting installation service.", new Object[0]);
                    }
                }
                c5114r0.mo11552Q3(new Bundle(), new Bundle());
            } else {
                c5114r0.mo11553R4(new Bundle());
            }
        } else {
            if (i != 3) {
                return false;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                c5114r1 = iInterfaceQueryLocalInterface2 instanceof InterfaceC5116s0 ? (InterfaceC5116s0) iInterfaceQueryLocalInterface2 : new C5114r0(strongBinder2);
            }
            BinderC5071z binderC5071z2 = (BinderC5071z) this;
            binderC5071z2.f26027f.m11533b(3, "clearAssetPackStorage AIDL call", new Object[0]);
            if (C5115s.m11555a(binderC5071z2.f26028g) && C5115s.m11556b(binderC5071z2.f26028g)) {
                C5056u.m11486h(binderC5071z2.f26029h.m11491g());
                c5114r1.mo11554T3(new Bundle());
            } else {
                c5114r1.mo11553R4(new Bundle());
            }
        }
        return true;
    }
}
