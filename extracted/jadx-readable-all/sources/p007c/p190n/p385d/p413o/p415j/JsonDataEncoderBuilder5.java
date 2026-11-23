package p007c.p190n.p385d.p413o.p415j;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p413o.EncodingException;
import p007c.p190n.p385d.p413o.ObjectEncoder;
import p007c.p190n.p385d.p413o.ObjectEncoderContext;
import p007c.p190n.p385d.p413o.ValueEncoder;
import p007c.p190n.p385d.p413o.ValueEncoderContext;
import p007c.p190n.p385d.p413o.p414i.EncoderConfig;

/* JADX INFO: renamed from: c.n.d.o.j.e, reason: use source file name */
/* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class JsonDataEncoderBuilder5 implements EncoderConfig<JsonDataEncoderBuilder5> {

    /* JADX INFO: renamed from: a */
    public static final a f27021a = new a(null);

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, ObjectEncoder<?>> f27022b;

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, ValueEncoder<?>> f27023c;

    /* JADX INFO: renamed from: d */
    public ObjectEncoder<Object> f27024d;

    /* JADX INFO: renamed from: e */
    public boolean f27025e;

    /* JADX INFO: renamed from: c.n.d.o.j.e$a */
    /* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
    public static final class a implements ValueEncoder<Date> {

        /* JADX INFO: renamed from: a */
        public static final DateFormat f27026a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f27026a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public a(JsonDataEncoderBuilder4 jsonDataEncoderBuilder4) {
        }

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.mo12052e(f27026a.format((Date) obj));
        }
    }

    public JsonDataEncoderBuilder5() {
        HashMap map = new HashMap();
        this.f27022b = map;
        HashMap map2 = new HashMap();
        this.f27023c = map2;
        this.f27024d = new ObjectEncoder() { // from class: c.n.d.o.j.a
            @Override // p007c.p190n.p385d.p413o.Encoder2
            /* JADX INFO: renamed from: a */
            public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) {
                JsonDataEncoderBuilder5.a aVar = JsonDataEncoderBuilder5.f27021a;
                StringBuilder sbM1556G = outline.m1556G("Couldn't find encoder for type ");
                sbM1556G.append(obj.getClass().getCanonicalName());
                throw new EncodingException(sbM1556G.toString());
            }
        };
        this.f27025e = false;
        map2.put(String.class, new ValueEncoder() { // from class: c.n.d.o.j.b
            @Override // p007c.p190n.p385d.p413o.Encoder2
            /* JADX INFO: renamed from: a */
            public void mo2772a(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
                JsonDataEncoderBuilder5.a aVar = JsonDataEncoderBuilder5.f27021a;
                valueEncoderContext.mo12052e((String) obj);
            }
        });
        map.remove(String.class);
        map2.put(Boolean.class, new ValueEncoder() { // from class: c.n.d.o.j.c
            @Override // p007c.p190n.p385d.p413o.Encoder2
            /* JADX INFO: renamed from: a */
            public void mo2772a(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
                JsonDataEncoderBuilder5.a aVar = JsonDataEncoderBuilder5.f27021a;
                valueEncoderContext.mo12053f(((Boolean) obj).booleanValue());
            }
        });
        map.remove(Boolean.class);
        map2.put(Date.class, f27021a);
        map.remove(Date.class);
    }
}
