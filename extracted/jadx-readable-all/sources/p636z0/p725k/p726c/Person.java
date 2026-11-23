package p636z0.p725k.p726c;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.k.c.u, reason: use source file name */
/* JADX INFO: compiled from: Person.java */
/* JADX INFO: loaded from: classes.dex */
public class Person {

    /* JADX INFO: renamed from: a */
    public CharSequence f37789a;

    /* JADX INFO: renamed from: b */
    public IconCompat f37790b;

    /* JADX INFO: renamed from: c */
    public String f37791c;

    /* JADX INFO: renamed from: d */
    public String f37792d;

    /* JADX INFO: renamed from: e */
    public boolean f37793e;

    /* JADX INFO: renamed from: f */
    public boolean f37794f;

    /* JADX INFO: renamed from: z0.k.c.u$a */
    /* JADX INFO: compiled from: Person.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public CharSequence f37795a;

        /* JADX INFO: renamed from: b */
        public IconCompat f37796b;

        /* JADX INFO: renamed from: c */
        public String f37797c;

        /* JADX INFO: renamed from: d */
        public String f37798d;

        /* JADX INFO: renamed from: e */
        public boolean f37799e;

        /* JADX INFO: renamed from: f */
        public boolean f37800f;
    }

    public Person(a aVar) {
        this.f37789a = aVar.f37795a;
        this.f37790b = aVar.f37796b;
        this.f37791c = aVar.f37797c;
        this.f37792d = aVar.f37798d;
        this.f37793e = aVar.f37799e;
        this.f37794f = aVar.f37800f;
    }

    /* JADX INFO: renamed from: a */
    public static Person m16129a(android.app.Person person) {
        a aVar = new a();
        aVar.f37795a = person.getName();
        aVar.f37796b = person.getIcon() != null ? IconCompat.m343b(person.getIcon()) : null;
        aVar.f37797c = person.getUri();
        aVar.f37798d = person.getKey();
        aVar.f37799e = person.isBot();
        aVar.f37800f = person.isImportant();
        return new Person(aVar);
    }

    /* JADX INFO: renamed from: b */
    public static Person m16130b(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        a aVar = new a();
        aVar.f37795a = bundle.getCharSequence("name");
        if (bundle2 != null) {
            PorterDuff.Mode mode = IconCompat.f674a;
            int i = bundle2.getInt("type");
            iconCompat = new IconCompat(i);
            iconCompat.f679f = bundle2.getInt("int1");
            iconCompat.f680g = bundle2.getInt("int2");
            iconCompat.f684k = bundle2.getString("string1");
            if (bundle2.containsKey("tint_list")) {
                iconCompat.f681h = (ColorStateList) bundle2.getParcelable("tint_list");
            }
            if (bundle2.containsKey("tint_mode")) {
                iconCompat.f682i = PorterDuff.Mode.valueOf(bundle2.getString("tint_mode"));
            }
            switch (i) {
                case -1:
                case 1:
                case 5:
                    iconCompat.f676c = bundle2.getParcelable("obj");
                    break;
                case 0:
                default:
                    outline.m1565P("Unknown type ", i, "IconCompat");
                    iconCompat = null;
                    break;
                case 2:
                case 4:
                case 6:
                    iconCompat.f676c = bundle2.getString("obj");
                    break;
                case 3:
                    iconCompat.f676c = bundle2.getByteArray("obj");
                    break;
            }
        } else {
            iconCompat = null;
        }
        aVar.f37796b = iconCompat;
        aVar.f37797c = bundle.getString("uri");
        aVar.f37798d = bundle.getString("key");
        aVar.f37799e = bundle.getBoolean("isBot");
        aVar.f37800f = bundle.getBoolean("isImportant");
        return new Person(aVar);
    }

    /* JADX INFO: renamed from: c */
    public android.app.Person m16131c() {
        android.app.Person.Builder name = new android.app.Person.Builder().setName(this.f37789a);
        IconCompat iconCompat = this.f37790b;
        return name.setIcon(iconCompat != null ? iconCompat.m355n() : null).setUri(this.f37791c).setKey(this.f37792d).setBot(this.f37793e).setImportant(this.f37794f).build();
    }

    /* JADX INFO: renamed from: d */
    public Bundle m16132d() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f37789a);
        IconCompat iconCompat = this.f37790b;
        if (iconCompat != null) {
            Objects.requireNonNull(iconCompat);
            bundle = new Bundle();
            switch (iconCompat.f675b) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f676c);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f676c);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f676c);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f676c);
                    break;
            }
            bundle.putInt("type", iconCompat.f675b);
            bundle.putInt("int1", iconCompat.f679f);
            bundle.putInt("int2", iconCompat.f680g);
            bundle.putString("string1", iconCompat.f684k);
            ColorStateList colorStateList = iconCompat.f681h;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f682i;
            if (mode != IconCompat.f674a) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f37791c);
        bundle2.putString("key", this.f37792d);
        bundle2.putBoolean("isBot", this.f37793e);
        bundle2.putBoolean("isImportant", this.f37794f);
        return bundle2;
    }
}
