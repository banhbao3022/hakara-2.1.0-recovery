package p636z0.p725k.p726c;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.ArraySet2;
import p636z0.p725k.p727d.LocusIdCompat;

/* JADX INFO: renamed from: z0.k.c.r, reason: use source file name */
/* JADX INFO: compiled from: NotificationCompatBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {

    /* JADX INFO: renamed from: a */
    public final Context f37781a;

    /* JADX INFO: renamed from: b */
    public final Notification.Builder f37782b;

    /* JADX INFO: renamed from: c */
    public final C8176m f37783c;

    /* JADX INFO: renamed from: d */
    public final List<Bundle> f37784d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Bundle f37785e = new Bundle();

    /* JADX WARN: Code duplicated, block: B:109:0x0351  */
    /* JADX WARN: Code duplicated, block: B:126:0x0394  */
    public NotificationCompatBuilder(C8176m c8176m) {
        Notification.BubbleMetadata bubbleMetadata;
        Notification.BubbleMetadata bubbleMetadataM16098b;
        Icon icon;
        this.f37783c = c8176m;
        this.f37781a = c8176m.f37739a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f37782b = new Notification.Builder(c8176m.f37739a, c8176m.f37729G);
        } else {
            this.f37782b = new Notification.Builder(c8176m.f37739a);
        }
        Notification notification = c8176m.f37736N;
        Icon icon2 = null;
        this.f37782b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c8176m.f37743e).setContentText(c8176m.f37744f).setContentInfo(c8176m.f37748j).setContentIntent(c8176m.f37745g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c8176m.f37746h, (notification.flags & 128) != 0).setLargeIcon(c8176m.f37747i).setNumber(c8176m.f37749k).setProgress(c8176m.f37757s, c8176m.f37758t, c8176m.f37759u);
        this.f37782b.setSubText(c8176m.f37755q).setUsesChronometer(c8176m.f37752n).setPriority(c8176m.f37750l);
        for (C8172i c8172i : c8176m.f37740b) {
            int i = Build.VERSION.SDK_INT;
            IconCompat iconCompatM16086a = c8172i.m16086a();
            Notification.Action.Builder builder = i >= 23 ? new Notification.Action.Builder(iconCompatM16086a != null ? iconCompatM16086a.m355n() : icon2, c8172i.f37694j, c8172i.f37695k) : new Notification.Action.Builder(iconCompatM16086a != null ? iconCompatM16086a.m350e() : 0, c8172i.f37694j, c8172i.f37695k);
            RemoteInput[] remoteInputArr = c8172i.f37687c;
            if (remoteInputArr != null) {
                int length = remoteInputArr.length;
                RemoteInput[] remoteInputArr2 = new RemoteInput[length];
                for (int i2 = 0; i2 < remoteInputArr.length; i2++) {
                    RemoteInput remoteInput = remoteInputArr[i2];
                    RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(remoteInput.f37801a).setLabel(remoteInput.f37802b).setChoices(remoteInput.f37803c).setAllowFreeFormInput(remoteInput.f37804d).addExtras(remoteInput.f37806f);
                    if (Build.VERSION.SDK_INT >= 29) {
                        builderAddExtras.setEditChoicesBeforeSending(remoteInput.f37805e);
                    }
                    remoteInputArr2[i2] = builderAddExtras.build();
                }
                for (int i3 = 0; i3 < length; i3++) {
                    builder.addRemoteInput(remoteInputArr2[i3]);
                }
            }
            Bundle bundle = c8172i.f37685a != null ? new Bundle(c8172i.f37685a) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", c8172i.f37689e);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 24) {
                builder.setAllowGeneratedReplies(c8172i.f37689e);
            }
            bundle.putInt("android.support.action.semanticAction", c8172i.f37691g);
            if (i4 >= 28) {
                builder.setSemanticAction(c8172i.f37691g);
            }
            if (i4 >= 29) {
                builder.setContextual(c8172i.f37692h);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", c8172i.f37690f);
            builder.addExtras(bundle);
            this.f37782b.addAction(builder.build());
            icon2 = null;
        }
        Bundle bundle2 = c8176m.f37725C;
        if (bundle2 != null) {
            this.f37785e.putAll(bundle2);
        }
        int i5 = Build.VERSION.SDK_INT;
        this.f37782b.setShowWhen(c8176m.f37751m);
        this.f37782b.setLocalOnly(c8176m.f37763y).setGroup(c8176m.f37760v).setGroupSummary(c8176m.f37761w).setSortKey(c8176m.f37762x);
        this.f37782b.setCategory(c8176m.f37724B).setColor(c8176m.f37726D).setVisibility(c8176m.f37727E).setPublicVersion(c8176m.f37728F).setSound(notification.sound, notification.audioAttributes);
        List listM16123a = i5 < 28 ? m16123a(m16124b(c8176m.f37741c), c8176m.f37738P) : c8176m.f37738P;
        if (listM16123a != null && !listM16123a.isEmpty()) {
            Iterator it = listM16123a.iterator();
            while (it.hasNext()) {
                this.f37782b.addPerson((String) it.next());
            }
        }
        if (c8176m.f37742d.size() > 0) {
            Bundle bundle3 = c8176m.m16107c().getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i6 = 0; i6 < c8176m.f37742d.size(); i6++) {
                String string = Integer.toString(i6);
                C8172i c8172i2 = c8176m.f37742d.get(i6);
                Object obj = NotificationCompatJellybean.f37786a;
                Bundle bundle6 = new Bundle();
                IconCompat iconCompatM16086a2 = c8172i2.m16086a();
                bundle6.putInt("icon", iconCompatM16086a2 != null ? iconCompatM16086a2.m350e() : 0);
                bundle6.putCharSequence(CainMediaMetadataRetriever.METADATA_KEY_TITLE, c8172i2.f37694j);
                bundle6.putParcelable("actionIntent", c8172i2.f37695k);
                Bundle bundle7 = c8172i2.f37685a != null ? new Bundle(c8172i2.f37685a) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", c8172i2.f37689e);
                bundle6.putBundle("extras", bundle7);
                bundle6.putParcelableArray("remoteInputs", NotificationCompatJellybean.m16127c(c8172i2.f37687c));
                bundle6.putBoolean("showsUserInterface", c8172i2.f37690f);
                bundle6.putInt("semanticAction", c8172i2.f37691g);
                bundle5.putBundle(string, bundle6);
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            c8176m.m16107c().putBundle("android.car.EXTENSIONS", bundle3);
            this.f37785e.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 23 && (icon = c8176m.f37737O) != null) {
            this.f37782b.setSmallIcon(icon);
        }
        if (i7 >= 24) {
            this.f37782b.setExtras(c8176m.f37725C).setRemoteInputHistory(null);
        }
        if (i7 >= 26) {
            this.f37782b.setBadgeIconType(c8176m.f37730H).setSettingsText(c8176m.f37756r).setShortcutId(c8176m.f37731I).setTimeoutAfter(c8176m.f37733K).setGroupAlertBehavior(0);
            if (c8176m.f37723A) {
                this.f37782b.setColorized(c8176m.f37764z);
            }
            if (TextUtils.isEmpty(c8176m.f37729G)) {
                bubbleMetadata = null;
            } else {
                bubbleMetadata = null;
                this.f37782b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        } else {
            bubbleMetadata = null;
        }
        if (i7 >= 28) {
            Iterator<Person> it2 = c8176m.f37741c.iterator();
            while (it2.hasNext()) {
                this.f37782b.addPerson(it2.next().m16131c());
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            this.f37782b.setAllowSystemGeneratedContextualActions(c8176m.f37734L);
            Notification.Builder builder2 = this.f37782b;
            C8175l c8175l = c8176m.f37735M;
            if (c8175l == null) {
                bubbleMetadataM16098b = bubbleMetadata;
            } else if (i8 >= 30) {
                bubbleMetadataM16098b = C8175l.b.m16100b(c8175l);
            } else if (i8 == 29) {
                bubbleMetadataM16098b = C8175l.a.m16098b(c8175l);
            } else {
                bubbleMetadataM16098b = bubbleMetadata;
            }
            builder2.setBubbleMetadata(bubbleMetadataM16098b);
            LocusIdCompat locusIdCompat = c8176m.f37732J;
            if (locusIdCompat != null) {
                this.f37782b.setLocusId(locusIdCompat.f37817b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m16123a(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet2 arraySet2 = new ArraySet2(list2.size() + list.size());
        arraySet2.addAll(list);
        arraySet2.addAll(list2);
        return new ArrayList(arraySet2);
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m16124b(List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Person person : list) {
            String string = person.f37791c;
            if (string == null) {
                if (person.f37789a != null) {
                    StringBuilder sbM1556G = outline.m1556G("name:");
                    sbM1556G.append((Object) person.f37789a);
                    string = sbM1556G.toString();
                } else {
                    string = "";
                }
            }
            arrayList.add(string);
        }
        return arrayList;
    }
}
