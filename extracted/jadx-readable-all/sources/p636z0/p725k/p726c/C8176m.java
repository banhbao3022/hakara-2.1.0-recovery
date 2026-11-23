package p636z0.p725k.p726c;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import mtp.media.karaoke.R;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.LocusIdCompat;

/* JADX INFO: renamed from: z0.k.c.m */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C8176m {

    /* JADX INFO: renamed from: A */
    public boolean f37723A;

    /* JADX INFO: renamed from: B */
    public String f37724B;

    /* JADX INFO: renamed from: C */
    public Bundle f37725C;

    /* JADX INFO: renamed from: D */
    public int f37726D;

    /* JADX INFO: renamed from: E */
    public int f37727E;

    /* JADX INFO: renamed from: F */
    public Notification f37728F;

    /* JADX INFO: renamed from: G */
    public String f37729G;

    /* JADX INFO: renamed from: H */
    public int f37730H;

    /* JADX INFO: renamed from: I */
    public String f37731I;

    /* JADX INFO: renamed from: J */
    public LocusIdCompat f37732J;

    /* JADX INFO: renamed from: K */
    public long f37733K;

    /* JADX INFO: renamed from: L */
    public boolean f37734L;

    /* JADX INFO: renamed from: M */
    public C8175l f37735M;

    /* JADX INFO: renamed from: N */
    public Notification f37736N;

    /* JADX INFO: renamed from: O */
    public Icon f37737O;

    /* JADX INFO: renamed from: P */
    @Deprecated
    public ArrayList<String> f37738P;

    /* JADX INFO: renamed from: a */
    public Context f37739a;

    /* JADX INFO: renamed from: b */
    public ArrayList<C8172i> f37740b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Person> f37741c;

    /* JADX INFO: renamed from: d */
    public ArrayList<C8172i> f37742d;

    /* JADX INFO: renamed from: e */
    public CharSequence f37743e;

    /* JADX INFO: renamed from: f */
    public CharSequence f37744f;

    /* JADX INFO: renamed from: g */
    public PendingIntent f37745g;

    /* JADX INFO: renamed from: h */
    public PendingIntent f37746h;

    /* JADX INFO: renamed from: i */
    public Bitmap f37747i;

    /* JADX INFO: renamed from: j */
    public CharSequence f37748j;

    /* JADX INFO: renamed from: k */
    public int f37749k;

    /* JADX INFO: renamed from: l */
    public int f37750l;

    /* JADX INFO: renamed from: m */
    public boolean f37751m;

    /* JADX INFO: renamed from: n */
    public boolean f37752n;

    /* JADX INFO: renamed from: o */
    public boolean f37753o;

    /* JADX INFO: renamed from: p */
    public AbstractC8180q f37754p;

    /* JADX INFO: renamed from: q */
    public CharSequence f37755q;

    /* JADX INFO: renamed from: r */
    public CharSequence f37756r;

    /* JADX INFO: renamed from: s */
    public int f37757s;

    /* JADX INFO: renamed from: t */
    public int f37758t;

    /* JADX INFO: renamed from: u */
    public boolean f37759u;

    /* JADX INFO: renamed from: v */
    public String f37760v;

    /* JADX INFO: renamed from: w */
    public boolean f37761w;

    /* JADX INFO: renamed from: x */
    public String f37762x;

    /* JADX INFO: renamed from: y */
    public boolean f37763y;

    /* JADX INFO: renamed from: z */
    public boolean f37764z;

    public C8176m(Context context, String str) {
        this.f37740b = new ArrayList<>();
        this.f37741c = new ArrayList<>();
        this.f37742d = new ArrayList<>();
        this.f37751m = true;
        this.f37763y = false;
        this.f37726D = 0;
        this.f37727E = 0;
        this.f37730H = 0;
        Notification notification = new Notification();
        this.f37736N = notification;
        this.f37739a = context;
        this.f37729G = str;
        notification.when = System.currentTimeMillis();
        this.f37736N.audioStreamType = -1;
        this.f37750l = 0;
        this.f37738P = new ArrayList<>();
        this.f37734L = true;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m16104d(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: a */
    public C8176m m16105a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f37740b.add(new C8172i(i, charSequence, pendingIntent));
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Notification m16106b() {
        Notification notificationBuild;
        Bundle bundle;
        RemoteViews remoteViewsMo16118g;
        RemoteViews remoteViewsMo16116e;
        NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
        AbstractC8180q abstractC8180q = notificationCompatBuilder.f37783c.f37754p;
        if (abstractC8180q != null) {
            abstractC8180q.mo16088b(notificationCompatBuilder);
        }
        RemoteViews remoteViewsMo16117f = abstractC8180q != null ? abstractC8180q.mo16117f(notificationCompatBuilder) : null;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && i < 24) {
            notificationCompatBuilder.f37782b.setExtras(notificationCompatBuilder.f37785e);
            notificationBuild = notificationCompatBuilder.f37782b.build();
        } else {
            notificationBuild = notificationCompatBuilder.f37782b.build();
        }
        if (remoteViewsMo16117f != null) {
            notificationBuild.contentView = remoteViewsMo16117f;
        } else {
            Objects.requireNonNull(notificationCompatBuilder.f37783c);
        }
        if (abstractC8180q != null && (remoteViewsMo16116e = abstractC8180q.mo16116e(notificationCompatBuilder)) != null) {
            notificationBuild.bigContentView = remoteViewsMo16116e;
        }
        if (abstractC8180q != null && (remoteViewsMo16118g = notificationCompatBuilder.f37783c.f37754p.mo16118g(notificationCompatBuilder)) != null) {
            notificationBuild.headsUpContentView = remoteViewsMo16118g;
        }
        if (abstractC8180q != null && (bundle = notificationBuild.extras) != null) {
            abstractC8180q.mo16096a(bundle);
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: c */
    public Bundle m16107c() {
        if (this.f37725C == null) {
            this.f37725C = new Bundle();
        }
        return this.f37725C;
    }

    /* JADX INFO: renamed from: e */
    public C8176m m16108e(CharSequence charSequence) {
        this.f37744f = m16104d(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C8176m m16109f(CharSequence charSequence) {
        this.f37743e = m16104d(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final void m16110g(int i, boolean z) {
        if (z) {
            Notification notification = this.f37736N;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.f37736N;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    /* JADX INFO: renamed from: h */
    public C8176m m16111h(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f37739a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
            }
        }
        this.f37747i = bitmap;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C8176m m16112i(int i, int i2, int i3) {
        Notification notification = this.f37736N;
        notification.ledARGB = i;
        notification.ledOnMS = i2;
        notification.ledOffMS = i3;
        notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C8176m m16113j(Uri uri) {
        Notification notification = this.f37736N;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C8176m m16114k(AbstractC8180q abstractC8180q) {
        if (this.f37754p != abstractC8180q) {
            this.f37754p = abstractC8180q;
            if (abstractC8180q != null && abstractC8180q.f37777a != this) {
                abstractC8180q.f37777a = this;
                m16114k(abstractC8180q);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C8176m m16115l(CharSequence charSequence) {
        this.f37736N.tickerText = m16104d(charSequence);
        return this;
    }

    @Deprecated
    public C8176m(Context context) {
        this(context, (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x023e  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0133  */
    /* JADX WARN: Code duplicated, block: B:83:0x0141  */
    /* JADX WARN: Illegal instructions before constructor call */
    public C8176m(Context context, Notification notification) {
        AbstractC8180q c8179p;
        LocusIdCompat locusIdCompat;
        C8175l c8175lM16097a;
        Bundle bundle;
        Bundle bundle2;
        ArrayList parcelableArrayList;
        Bundle bundle3;
        C8172i.a aVar;
        Notification.BubbleMetadata bubbleMetadata;
        LocusId locusId;
        int i = Build.VERSION.SDK_INT;
        this(context, i >= 26 ? notification.getChannelId() : null);
        Bundle bundle4 = notification.extras;
        if (bundle4 != null) {
            String string = bundle4.getString("androidx.core.app.extra.COMPAT_TEMPLATE");
            if (string != null) {
                switch (string) {
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                        c8179p = new C8177n();
                        break;
                    case "androidx.core.app.NotificationCompat$BigPictureStyle":
                        c8179p = new C8173j();
                        break;
                    case "androidx.core.app.NotificationCompat$InboxStyle":
                        c8179p = new C8178o();
                        break;
                    case "androidx.core.app.NotificationCompat$BigTextStyle":
                        c8179p = new C8174k();
                        break;
                    case "androidx.core.app.NotificationCompat$MessagingStyle":
                        c8179p = new C8179p();
                        break;
                    default:
                        c8179p = null;
                        break;
                }
            } else {
                c8179p = null;
            }
            if (c8179p == null) {
                if (!bundle4.containsKey("android.selfDisplayName") && !bundle4.containsKey("android.messagingStyleUser")) {
                    if (bundle4.containsKey("android.picture")) {
                        c8179p = new C8173j();
                    } else if (bundle4.containsKey("android.bigText")) {
                        c8179p = new C8174k();
                    } else if (bundle4.containsKey("android.textLines")) {
                        c8179p = new C8178o();
                    } else {
                        String string2 = bundle4.getString("android.template");
                        if (string2 == null) {
                            c8179p = null;
                        } else if (string2.equals(Notification.BigPictureStyle.class.getName())) {
                            c8179p = new C8173j();
                        } else if (string2.equals(Notification.BigTextStyle.class.getName())) {
                            c8179p = new C8174k();
                        } else if (string2.equals(Notification.InboxStyle.class.getName())) {
                            c8179p = new C8178o();
                        } else if (i < 24) {
                            c8179p = null;
                        } else if (string2.equals(Notification.MessagingStyle.class.getName())) {
                            c8179p = new C8179p();
                        } else if (string2.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                            c8179p = new C8177n();
                        } else {
                            c8179p = null;
                        }
                    }
                } else {
                    c8179p = new C8179p();
                }
            }
            if (c8179p == null) {
                c8179p = null;
            } else {
                try {
                    c8179p.mo16091h(bundle4);
                } catch (ClassCastException unused) {
                    c8179p = null;
                }
            }
        } else {
            c8179p = null;
        }
        m16109f(notification.extras.getCharSequence("android.title"));
        m16108e(notification.extras.getCharSequence("android.text"));
        this.f37748j = m16104d(notification.extras.getCharSequence("android.infoText"));
        this.f37755q = m16104d(notification.extras.getCharSequence("android.subText"));
        int i2 = Build.VERSION.SDK_INT;
        this.f37756r = m16104d(i2 >= 26 ? notification.getSettingsText() : null);
        m16114k(c8179p);
        this.f37745g = notification.contentIntent;
        this.f37760v = notification.getGroup();
        this.f37761w = (notification.flags & 512) != 0;
        if (i2 < 29 || (locusId = notification.getLocusId()) == null) {
            locusIdCompat = null;
        } else {
            C8162a.m16063h(locusId, "locusId cannot be null");
            String id = locusId.getId();
            if (!TextUtils.isEmpty(id)) {
                locusIdCompat = new LocusIdCompat(id);
            } else {
                throw new IllegalArgumentException("id cannot be empty");
            }
        }
        this.f37732J = locusIdCompat;
        this.f37736N.when = notification.when;
        this.f37751m = notification.extras.getBoolean("android.showWhen");
        this.f37752n = notification.extras.getBoolean("android.showChronometer");
        m16110g(16, (notification.flags & 16) != 0);
        m16110g(8, (notification.flags & 8) != 0);
        m16110g(2, (notification.flags & 2) != 0);
        this.f37763y = (notification.flags & 256) != 0;
        m16111h(notification.largeIcon);
        this.f37730H = i2 >= 26 ? notification.getBadgeIconType() : 0;
        this.f37724B = notification.category;
        if (i2 < 29 || (bubbleMetadata = notification.getBubbleMetadata()) == null) {
            c8175lM16097a = null;
        } else if (i2 >= 30) {
            c8175lM16097a = C8175l.b.m16099a(bubbleMetadata);
        } else if (i2 == 29) {
            c8175lM16097a = C8175l.a.m16097a(bubbleMetadata);
        } else {
            c8175lM16097a = null;
        }
        this.f37735M = c8175lM16097a;
        this.f37749k = notification.number;
        m16115l(notification.tickerText);
        this.f37745g = notification.contentIntent;
        this.f37736N.deleteIntent = notification.deleteIntent;
        PendingIntent pendingIntent = notification.fullScreenIntent;
        boolean z = (notification.flags & 128) != 0;
        this.f37746h = pendingIntent;
        m16110g(128, z);
        Uri uri = notification.sound;
        int i3 = notification.audioStreamType;
        Notification notification2 = this.f37736N;
        notification2.sound = uri;
        notification2.audioStreamType = i3;
        notification2.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i3).build();
        this.f37736N.vibrate = notification.vibrate;
        m16112i(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int i4 = notification.defaults;
        Notification notification3 = this.f37736N;
        notification3.defaults = i4;
        if ((i4 & 4) != 0) {
            notification3.flags |= 1;
        }
        this.f37750l = notification.priority;
        this.f37726D = notification.color;
        this.f37727E = notification.visibility;
        this.f37728F = notification.publicVersion;
        this.f37762x = notification.getSortKey();
        this.f37733K = i2 >= 26 ? notification.getTimeoutAfter() : 0L;
        this.f37731I = i2 >= 26 ? notification.getShortcutId() : null;
        int i5 = bundle4.getInt("android.progressMax");
        int i6 = bundle4.getInt("android.progress");
        boolean z2 = bundle4.getBoolean("android.progressIndeterminate");
        this.f37757s = i5;
        this.f37758t = i6;
        this.f37759u = z2;
        this.f37734L = i2 >= 29 ? notification.getAllowSystemGeneratedContextualActions() : false;
        int i7 = notification.icon;
        int i8 = notification.iconLevel;
        Notification notification4 = this.f37736N;
        notification4.icon = i7;
        notification4.iconLevel = i8;
        String str = "android.people.list";
        String str2 = "android.colorized";
        String str3 = "android.chronometerCountDown";
        String str4 = "invisible_actions";
        AbstractC8180q abstractC8180q = c8179p;
        String str5 = "android.people";
        if (notification.extras == null) {
            bundle = null;
        } else {
            bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            bundle.remove("android.intent.extra.CHANNEL_ID");
            bundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle.remove("android.showWhen");
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove("android.progressIndeterminate");
            bundle.remove("android.chronometerCountDown");
            bundle.remove("android.colorized");
            bundle.remove("android.people.list");
            bundle.remove("android.people");
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            Bundle bundle5 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle5 != null) {
                Bundle bundle6 = new Bundle(bundle5);
                str4 = "invisible_actions";
                bundle6.remove(str4);
                bundle.putBundle("android.car.EXTENSIONS", bundle6);
            } else {
                str4 = "invisible_actions";
            }
            if (abstractC8180q != null) {
                abstractC8180q.mo16089c(bundle);
            }
        }
        if (bundle != null) {
            Bundle bundle7 = this.f37725C;
            if (bundle7 == null) {
                this.f37725C = new Bundle(bundle);
            } else {
                bundle7.putAll(bundle);
            }
        }
        int i9 = 23;
        if (i2 >= 23) {
            this.f37737O = notification.getSmallIcon();
        }
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null && actionArr.length != 0) {
            int length = actionArr.length;
            int i10 = 0;
            while (i10 < length) {
                Notification.Action action = actionArr[i10];
                if (Build.VERSION.SDK_INT >= i9 && action.getIcon() != null) {
                    aVar = new C8172i.a(IconCompat.m343b(action.getIcon()), action.title, action.actionIntent);
                } else {
                    aVar = new C8172i.a(action.icon, action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length != 0) {
                    int length2 = remoteInputs.length;
                    int i11 = 0;
                    while (i11 < length2) {
                        RemoteInput remoteInput = remoteInputs[i11];
                        RemoteInput[] remoteInputArr = remoteInputs;
                        Notification.Action[] actionArr2 = actionArr;
                        RemoteInput.a aVar2 = new RemoteInput.a(remoteInput.getResultKey());
                        aVar2.f37811d = remoteInput.getLabel();
                        aVar2.f37812e = remoteInput.getChoices();
                        aVar2.f37813f = remoteInput.getAllowFreeFormInput();
                        Bundle extras = remoteInput.getExtras();
                        int i12 = length2;
                        if (extras != null) {
                            aVar2.f37810c.putAll(extras);
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            aVar2.f37814g = remoteInput.getEditChoicesBeforeSending();
                        }
                        int i13 = length;
                        String str6 = str2;
                        String str7 = str3;
                        String str8 = str;
                        String str9 = str5;
                        RemoteInput remoteInput2 = new RemoteInput(aVar2.f37808a, aVar2.f37811d, aVar2.f37812e, aVar2.f37813f, aVar2.f37814g, aVar2.f37810c, aVar2.f37809b);
                        if (aVar.f37701f == null) {
                            aVar.f37701f = new ArrayList<>();
                        }
                        aVar.f37701f.add(remoteInput2);
                        i11++;
                        length = i13;
                        remoteInputs = remoteInputArr;
                        actionArr = actionArr2;
                        length2 = i12;
                        str2 = str6;
                        str3 = str7;
                        str = str8;
                        str5 = str9;
                    }
                }
                String str10 = str3;
                Notification.Action[] actionArr3 = actionArr;
                String str11 = str;
                String str12 = str2;
                int i14 = length;
                String str13 = str5;
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 24) {
                    aVar.f37699d = action.getAllowGeneratedReplies();
                }
                if (i15 >= 28) {
                    aVar.f37702g = action.getSemanticAction();
                }
                if (i15 >= 29) {
                    aVar.f37704i = action.isContextual();
                }
                this.f37740b.add(aVar.m16087a());
                i10++;
                length = i14;
                actionArr = actionArr3;
                str2 = str12;
                str3 = str10;
                str = str11;
                str5 = str13;
                i9 = 23;
            }
        }
        String str14 = str3;
        String str15 = str;
        String str16 = str2;
        String str17 = str5;
        ArrayList<C8172i> arrayList = new ArrayList();
        Bundle bundle8 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle8 != null && (bundle3 = bundle8.getBundle(str4)) != null) {
            for (int i16 = 0; i16 < bundle3.size(); i16++) {
                Bundle bundle9 = bundle3.getBundle(Integer.toString(i16));
                Object obj = NotificationCompatJellybean.f37786a;
                Bundle bundle10 = bundle9.getBundle("extras");
                boolean z3 = bundle10 != null ? bundle10.getBoolean("android.support.allowGeneratedReplies", false) : false;
                int i17 = bundle9.getInt("icon");
                arrayList.add(new C8172i(i17 == 0 ? null : IconCompat.m345d(null, "", i17), bundle9.getCharSequence(CainMediaMetadataRetriever.METADATA_KEY_TITLE), (PendingIntent) bundle9.getParcelable("actionIntent"), bundle9.getBundle("extras"), NotificationCompatJellybean.m16125a(NotificationCompatJellybean.m16126b(bundle9, "remoteInputs")), NotificationCompatJellybean.m16125a(NotificationCompatJellybean.m16126b(bundle9, "dataOnlyRemoteInputs")), z3, bundle9.getInt("semanticAction"), bundle9.getBoolean("showsUserInterface"), false));
            }
        }
        if (!arrayList.isEmpty()) {
            for (C8172i c8172i : arrayList) {
                if (c8172i != null) {
                    this.f37742d.add(c8172i);
                }
            }
        }
        String[] stringArray = notification.extras.getStringArray(str17);
        if (stringArray != null && stringArray.length != 0) {
            for (String str18 : stringArray) {
                if (str18 != null && !str18.isEmpty()) {
                    this.f37738P.add(str18);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(str15)) != null && !parcelableArrayList.isEmpty()) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                this.f37741c.add(Person.m16129a((Person) it.next()));
            }
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 24) {
            bundle2 = bundle4;
            if (bundle2.containsKey(str14)) {
                boolean z4 = bundle2.getBoolean(str14);
                this.f37753o = z4;
                m16107c().putBoolean(str14, z4);
            }
        } else {
            bundle2 = bundle4;
        }
        if (i18 < 26 || !bundle2.containsKey(str16)) {
            return;
        }
        this.f37764z = bundle2.getBoolean(str16);
        this.f37723A = true;
    }
}
