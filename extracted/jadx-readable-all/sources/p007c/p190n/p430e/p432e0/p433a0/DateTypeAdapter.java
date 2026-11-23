package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p432e0.JavaVersion;
import p007c.p190n.p430e.p432e0.PreJava9DateFormatProvider;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.c, reason: use source file name */
/* JADX INFO: compiled from: DateTypeAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class DateTypeAdapter extends TypeAdapter2<Date> {

    /* JADX INFO: renamed from: a */
    public static final TypeAdapterFactory f27336a = new a();

    /* JADX INFO: renamed from: b */
    public final List<DateFormat> f27337b;

    /* JADX INFO: renamed from: c.n.e.e0.a0.c$a */
    /* JADX INFO: compiled from: DateTypeAdapter.java */
    public class a implements TypeAdapterFactory {
        @Override // p007c.p190n.p430e.TypeAdapterFactory
        /* JADX INFO: renamed from: a */
        public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
            if (typeToken.f27513a == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    }

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f27337b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.f27483a >= 9) {
            arrayList.add(PreJava9DateFormatProvider.m12290a(2, 2));
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003d */
    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Date mo12212a(p007c.p190n.p430e.p437g0.JsonReader2 r3) throws java.io.IOException {
        /*
            r2 = this;
            c.n.e.g0.b r0 = r3.mo12234H0()
            c.n.e.g0.b r1 = p007c.p190n.p430e.p437g0.JsonToken.NULL
            if (r0 != r1) goto Ld
            r3.mo12249z0()
            r3 = 0
            goto L35
        Ld:
            java.lang.String r3 = r3.mo12232F0()
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.f27337b     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3d
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3d
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L3d
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L3d
            monitor-exit(r2)
            goto L35
        L2a:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L36 java.lang.Throwable -> L3d
            r1 = 0
            r0.<init>(r1)     // Catch: java.text.ParseException -> L36 java.lang.Throwable -> L3d
            java.util.Date r3 = p007c.p190n.p430e.p432e0.p433a0.p434t.ISO8601Utils.m12270b(r3, r0)     // Catch: java.text.ParseException -> L36 java.lang.Throwable -> L3d
            monitor-exit(r2)
        L35:
            return r3
        L36:
            r0 = move-exception
            c.n.e.y r1 = new c.n.e.y     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3d
            throw r1     // Catch: java.lang.Throwable -> L3d
        L3d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p430e.p432e0.p433a0.DateTypeAdapter.mo12212a(c.n.e.g0.a):java.lang.Object");
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            try {
                if (date2 == null) {
                    jsonWriter.mo12254O();
                } else {
                    jsonWriter.mo12261x0(this.f27337b.get(0).format(date2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
