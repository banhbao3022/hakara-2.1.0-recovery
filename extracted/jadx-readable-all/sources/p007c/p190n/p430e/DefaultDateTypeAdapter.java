package p007c.p190n.p430e;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p432e0.JavaVersion;
import p007c.p190n.p430e.p432e0.PreJava9DateFormatProvider;
import p007c.p190n.p430e.p432e0.p433a0.p434t.ISO8601Utils;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.a, reason: use source file name */
/* JADX INFO: compiled from: DefaultDateTypeAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultDateTypeAdapter extends TypeAdapter2<Date> {

    /* JADX INFO: renamed from: a */
    public final Class<? extends Date> f27313a;

    /* JADX INFO: renamed from: b */
    public final List<DateFormat> f27314b;

    public DefaultDateTypeAdapter(int i, int i2) {
        this(Date.class, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static Class<? extends Date> m12211c(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public Date mo12212a(JsonReader2 jsonReader2) throws IOException {
        Date dateM12270b;
        Date date;
        if (jsonReader2.mo12234H0() == JsonToken.NULL) {
            jsonReader2.mo12249z0();
            return null;
        }
        String strMo12232F0 = jsonReader2.mo12232F0();
        synchronized (this.f27314b) {
            Iterator<DateFormat> it = this.f27314b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    try {
                        dateM12270b = ISO8601Utils.m12270b(strMo12232F0, new ParsePosition(0));
                        break;
                    } catch (ParseException e) {
                        throw new JsonSyntaxException(strMo12232F0, e);
                    }
                }
                try {
                    dateM12270b = it.next().parse(strMo12232F0);
                    break;
                } catch (ParseException unused) {
                }
            }
        }
        Class<? extends Date> cls = this.f27313a;
        if (cls == Date.class) {
            return dateM12270b;
        }
        if (cls == Timestamp.class) {
            date = new Timestamp(dateM12270b.getTime());
        } else {
            if (cls != java.sql.Date.class) {
                throw new AssertionError();
            }
            date = new java.sql.Date(dateM12270b.getTime());
        }
        return date;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        if (date2 == null) {
            jsonWriter.mo12254O();
            return;
        }
        synchronized (this.f27314b) {
            jsonWriter.mo12261x0(this.f27314b.get(0).format(date2));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f27314b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sbM1556G = outline.m1556G("DefaultDateTypeAdapter(");
            sbM1556G.append(((SimpleDateFormat) dateFormat).toPattern());
            sbM1556G.append(')');
            return sbM1556G.toString();
        }
        StringBuilder sbM1556G2 = outline.m1556G("DefaultDateTypeAdapter(");
        sbM1556G2.append(dateFormat.getClass().getSimpleName());
        sbM1556G2.append(')');
        return sbM1556G2.toString();
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f27314b = arrayList;
        m12211c(cls);
        this.f27313a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (JavaVersion.f27483a >= 9) {
            arrayList.add(PreJava9DateFormatProvider.m12290a(i, i2));
        }
    }
}
