package p636z0.p725k.p726c;

import android.app.Notification;
import android.app.Person;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p636z0.p725k.p737j.BidiFormatter;

/* JADX INFO: renamed from: z0.k.c.p */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C8179p extends AbstractC8180q {

    /* JADX INFO: renamed from: e */
    public final List<a> f37766e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List<a> f37767f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public Person f37768g;

    /* JADX INFO: renamed from: h */
    public CharSequence f37769h;

    /* JADX INFO: renamed from: i */
    public Boolean f37770i;

    public C8179p() {
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: a */
    public void mo16096a(Bundle bundle) {
        super.mo16096a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f37768g.f37789a);
        bundle.putBundle("android.messagingStyleUser", this.f37768g.m16132d());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f37769h);
        if (this.f37769h != null && this.f37770i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f37769h);
        }
        if (!this.f37766e.isEmpty()) {
            bundle.putParcelableArray("android.messages", a.m16120a(this.f37766e));
        }
        if (!this.f37767f.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", a.m16120a(this.f37767f));
        }
        Boolean bool = this.f37770i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153  */
    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: b */
    public void mo16088b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        boolean zBooleanValue;
        a aVar;
        boolean z;
        boolean z2;
        C8176m c8176m = this.f37777a;
        if (c8176m == null || c8176m.f37739a.getApplicationInfo().targetSdkVersion >= 28 || this.f37770i != null) {
            Boolean bool = this.f37770i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else if (this.f37769h != null) {
            zBooleanValue = true;
        } else {
            zBooleanValue = false;
        }
        this.f37770i = Boolean.valueOf(zBooleanValue);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            Notification.MessagingStyle messagingStyle = i >= 28 ? new Notification.MessagingStyle(this.f37768g.m16131c()) : new Notification.MessagingStyle(this.f37768g.f37789a);
            Iterator<a> it = this.f37766e.iterator();
            while (it.hasNext()) {
                messagingStyle.addMessage(it.next().m16122c());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<a> it2 = this.f37767f.iterator();
                while (it2.hasNext()) {
                    messagingStyle.addHistoricMessage(it2.next().m16122c());
                }
            }
            if (this.f37770i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setConversationTitle(this.f37769h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setGroupConversation(this.f37770i.booleanValue());
            }
            messagingStyle.setBuilder(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f37782b);
            return;
        }
        int size = this.f37766e.size();
        while (true) {
            size--;
            if (size < 0) {
                if (this.f37766e.isEmpty()) {
                    aVar = null;
                    break;
                } else {
                    List<a> list = this.f37766e;
                    aVar = list.get(list.size() - 1);
                    break;
                }
            }
            aVar = this.f37766e.get(size);
            Person person = aVar.f37773c;
            if (person != null && !TextUtils.isEmpty(person.f37789a)) {
                break;
            }
        }
        if (this.f37769h != null && this.f37770i.booleanValue()) {
            ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f37782b.setContentTitle(this.f37769h);
        } else if (aVar != null) {
            NotificationCompatBuilder notificationCompatBuilder = (NotificationCompatBuilder) notificationBuilderWithBuilderAccessor;
            notificationCompatBuilder.f37782b.setContentTitle("");
            Person person2 = aVar.f37773c;
            if (person2 != null) {
                notificationCompatBuilder.f37782b.setContentTitle(person2.f37789a);
            }
        }
        if (aVar != null) {
            ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f37782b.setContentText(this.f37769h != null ? m16119i(aVar) : aVar.f37771a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f37769h == null) {
            int size2 = this.f37766e.size() - 1;
            while (true) {
                if (size2 < 0) {
                    z2 = false;
                    break;
                }
                Person person3 = this.f37766e.get(size2).f37773c;
                if (person3 != null && person3.f37789a == null) {
                    z2 = true;
                    break;
                }
                size2--;
            }
            if (z2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        for (int size3 = this.f37766e.size() - 1; size3 >= 0; size3--) {
            a aVar2 = this.f37766e.get(size3);
            CharSequence charSequenceM16119i = z ? m16119i(aVar2) : aVar2.f37771a;
            if (size3 != this.f37766e.size() - 1) {
                spannableStringBuilder.insert(0, (CharSequence) "\n");
            }
            spannableStringBuilder.insert(0, charSequenceM16119i);
        }
        new Notification.BigTextStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f37782b).setBigContentTitle(null).bigText(spannableStringBuilder);
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: c */
    public void mo16089c(Bundle bundle) {
        super.mo16089c(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: d */
    public String mo16090d() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: h */
    public void mo16091h(Bundle bundle) {
        super.mo16091h(bundle);
        this.f37766e.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f37768g = Person.m16130b(bundle.getBundle("android.messagingStyleUser"));
        } else {
            Person.a aVar = new Person.a();
            aVar.f37795a = bundle.getString("android.selfDisplayName");
            this.f37768g = new Person(aVar);
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f37769h = charSequence;
        if (charSequence == null) {
            this.f37769h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            this.f37766e.addAll(a.m16121b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f37767f.addAll(a.m16121b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f37770i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    /* JADX INFO: renamed from: i */
    public final CharSequence m16119i(a aVar) {
        int i;
        BidiFormatter bidiFormatterM16209c = BidiFormatter.m16209c();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 1 != 0 ? -16777216 : -1;
        Person person = aVar.f37773c;
        CharSequence charSequence = person == null ? "" : person.f37789a;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f37768g.f37789a;
            if (1 != 0 && (i = this.f37777a.f37726D) != 0) {
                i2 = i;
            }
        }
        CharSequence charSequenceM16210d = bidiFormatterM16209c.m16210d(charSequence);
        spannableStringBuilder.append(charSequenceM16210d);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i2), null), spannableStringBuilder.length() - charSequenceM16210d.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = aVar.f37771a;
        spannableStringBuilder.append((CharSequence) "  ").append(bidiFormatterM16209c.m16210d(charSequence2 != null ? charSequence2 : ""));
        return spannableStringBuilder;
    }

    @Deprecated
    public C8179p(CharSequence charSequence) {
        Person.a aVar = new Person.a();
        aVar.f37795a = charSequence;
        this.f37768g = new Person(aVar);
    }

    /* JADX INFO: renamed from: z0.k.c.p$a */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final CharSequence f37771a;

        /* JADX INFO: renamed from: b */
        public final long f37772b;

        /* JADX INFO: renamed from: c */
        public final Person f37773c;

        /* JADX INFO: renamed from: d */
        public Bundle f37774d;

        /* JADX INFO: renamed from: e */
        public String f37775e;

        /* JADX INFO: renamed from: f */
        public Uri f37776f;

        public a(CharSequence charSequence, long j2, Person person) {
            this.f37774d = new Bundle();
            this.f37771a = charSequence;
            this.f37772b = j2;
            this.f37773c = person;
        }

        /* JADX INFO: renamed from: a */
        public static Bundle[] m16120a(List<a> list) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a aVar = list.get(i);
                Objects.requireNonNull(aVar);
                Bundle bundle = new Bundle();
                CharSequence charSequence = aVar.f37771a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", aVar.f37772b);
                Person person = aVar.f37773c;
                if (person != null) {
                    bundle.putCharSequence("sender", person.f37789a);
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", aVar.f37773c.m16131c());
                    } else {
                        bundle.putBundle("person", aVar.f37773c.m16132d());
                    }
                }
                String str = aVar.f37775e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = aVar.f37776f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = aVar.f37774d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                bundleArr[i] = bundle;
            }
            return bundleArr;
        }

        /* JADX INFO: renamed from: b */
        public static List<a> m16121b(Parcelable[] parcelableArr) {
            Person person;
            ArrayList arrayList = new ArrayList(parcelableArr.length);
            for (int i = 0; i < parcelableArr.length; i++) {
                if (parcelableArr[i] instanceof Bundle) {
                    Bundle bundle = (Bundle) parcelableArr[i];
                    a aVar = null;
                    try {
                        if (bundle.containsKey("text") && bundle.containsKey("time")) {
                            if (bundle.containsKey("person")) {
                                person = Person.m16130b(bundle.getBundle("person"));
                            } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                                person = Person.m16129a((Person) bundle.getParcelable("sender_person"));
                            } else if (bundle.containsKey("sender")) {
                                Person.a aVar2 = new Person.a();
                                aVar2.f37795a = bundle.getCharSequence("sender");
                                person = new Person(aVar2);
                            } else {
                                person = null;
                            }
                            a aVar3 = new a(bundle.getCharSequence("text"), bundle.getLong("time"), person);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                String string = bundle.getString("type");
                                Uri uri = (Uri) bundle.getParcelable("uri");
                                aVar3.f37775e = string;
                                aVar3.f37776f = uri;
                            }
                            if (bundle.containsKey("extras")) {
                                aVar3.f37774d.putAll(bundle.getBundle("extras"));
                            }
                            aVar = aVar3;
                        }
                    } catch (ClassCastException unused) {
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: c */
        public Notification.MessagingStyle.Message m16122c() {
            Notification.MessagingStyle.Message message;
            Person person = this.f37773c;
            if (Build.VERSION.SDK_INT >= 28) {
                message = new Notification.MessagingStyle.Message(this.f37771a, this.f37772b, person != null ? person.m16131c() : null);
            } else {
                message = new Notification.MessagingStyle.Message(this.f37771a, this.f37772b, person != null ? person.f37789a : null);
            }
            String str = this.f37775e;
            if (str != null) {
                message.setData(str, this.f37776f);
            }
            return message;
        }

        @Deprecated
        public a(CharSequence charSequence, long j2, CharSequence charSequence2) {
            Person.a aVar = new Person.a();
            aVar.f37795a = charSequence2;
            this(charSequence, j2, new Person(aVar));
        }
    }

    public C8179p(Person person) {
        if (!TextUtils.isEmpty(person.f37789a)) {
            this.f37768g = person;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
