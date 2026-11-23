package p007c.p190n.p430e.p432e0.p433a0;

import com.cgfay.media.CainMediaMetadataRetriever;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.JsonArray;
import p007c.p190n.p430e.JsonElement;
import p007c.p190n.p430e.JsonIOException;
import p007c.p190n.p430e.JsonNull;
import p007c.p190n.p430e.JsonObject;
import p007c.p190n.p430e.JsonPrimitive;
import p007c.p190n.p430e.JsonSyntaxException;
import p007c.p190n.p430e.TypeAdapter;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p431d0.SerializedName;
import p007c.p190n.p430e.p432e0.LazilyParsedNumber;
import p007c.p190n.p430e.p432e0.LinkedTreeMap;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.o, reason: use source file name */
/* JADX INFO: compiled from: TypeAdapters.java */
/* JADX INFO: loaded from: classes.dex */
public final class TypeAdapters {

    /* JADX INFO: renamed from: A */
    public static final TypeAdapter2<String> f27388A;

    /* JADX INFO: renamed from: B */
    public static final TypeAdapter2<BigDecimal> f27389B;

    /* JADX INFO: renamed from: C */
    public static final TypeAdapter2<BigInteger> f27390C;

    /* JADX INFO: renamed from: D */
    public static final TypeAdapterFactory f27391D;

    /* JADX INFO: renamed from: E */
    public static final TypeAdapter2<StringBuilder> f27392E;

    /* JADX INFO: renamed from: F */
    public static final TypeAdapterFactory f27393F;

    /* JADX INFO: renamed from: G */
    public static final TypeAdapter2<StringBuffer> f27394G;

    /* JADX INFO: renamed from: H */
    public static final TypeAdapterFactory f27395H;

    /* JADX INFO: renamed from: I */
    public static final TypeAdapter2<URL> f27396I;

    /* JADX INFO: renamed from: J */
    public static final TypeAdapterFactory f27397J;

    /* JADX INFO: renamed from: K */
    public static final TypeAdapter2<URI> f27398K;

    /* JADX INFO: renamed from: L */
    public static final TypeAdapterFactory f27399L;

    /* JADX INFO: renamed from: M */
    public static final TypeAdapter2<InetAddress> f27400M;

    /* JADX INFO: renamed from: N */
    public static final TypeAdapterFactory f27401N;

    /* JADX INFO: renamed from: O */
    public static final TypeAdapter2<UUID> f27402O;

    /* JADX INFO: renamed from: P */
    public static final TypeAdapterFactory f27403P;

    /* JADX INFO: renamed from: Q */
    public static final TypeAdapter2<Currency> f27404Q;

    /* JADX INFO: renamed from: R */
    public static final TypeAdapterFactory f27405R;

    /* JADX INFO: renamed from: S */
    public static final TypeAdapterFactory f27406S;

    /* JADX INFO: renamed from: T */
    public static final TypeAdapter2<Calendar> f27407T;

    /* JADX INFO: renamed from: U */
    public static final TypeAdapterFactory f27408U;

    /* JADX INFO: renamed from: V */
    public static final TypeAdapter2<Locale> f27409V;

    /* JADX INFO: renamed from: W */
    public static final TypeAdapterFactory f27410W;

    /* JADX INFO: renamed from: X */
    public static final TypeAdapter2<JsonElement> f27411X;

    /* JADX INFO: renamed from: Y */
    public static final TypeAdapterFactory f27412Y;

    /* JADX INFO: renamed from: Z */
    public static final TypeAdapterFactory f27413Z;

    /* JADX INFO: renamed from: a */
    public static final TypeAdapter2<Class> f27414a;

    /* JADX INFO: renamed from: b */
    public static final TypeAdapterFactory f27415b;

    /* JADX INFO: renamed from: c */
    public static final TypeAdapter2<BitSet> f27416c;

    /* JADX INFO: renamed from: d */
    public static final TypeAdapterFactory f27417d;

    /* JADX INFO: renamed from: e */
    public static final TypeAdapter2<Boolean> f27418e;

    /* JADX INFO: renamed from: f */
    public static final TypeAdapter2<Boolean> f27419f;

    /* JADX INFO: renamed from: g */
    public static final TypeAdapterFactory f27420g;

    /* JADX INFO: renamed from: h */
    public static final TypeAdapter2<Number> f27421h;

    /* JADX INFO: renamed from: i */
    public static final TypeAdapterFactory f27422i;

    /* JADX INFO: renamed from: j */
    public static final TypeAdapter2<Number> f27423j;

    /* JADX INFO: renamed from: k */
    public static final TypeAdapterFactory f27424k;

    /* JADX INFO: renamed from: l */
    public static final TypeAdapter2<Number> f27425l;

    /* JADX INFO: renamed from: m */
    public static final TypeAdapterFactory f27426m;

    /* JADX INFO: renamed from: n */
    public static final TypeAdapter2<AtomicInteger> f27427n;

    /* JADX INFO: renamed from: o */
    public static final TypeAdapterFactory f27428o;

    /* JADX INFO: renamed from: p */
    public static final TypeAdapter2<AtomicBoolean> f27429p;

    /* JADX INFO: renamed from: q */
    public static final TypeAdapterFactory f27430q;

    /* JADX INFO: renamed from: r */
    public static final TypeAdapter2<AtomicIntegerArray> f27431r;

    /* JADX INFO: renamed from: s */
    public static final TypeAdapterFactory f27432s;

    /* JADX INFO: renamed from: t */
    public static final TypeAdapter2<Number> f27433t;

    /* JADX INFO: renamed from: u */
    public static final TypeAdapter2<Number> f27434u;

    /* JADX INFO: renamed from: v */
    public static final TypeAdapter2<Number> f27435v;

    /* JADX INFO: renamed from: w */
    public static final TypeAdapter2<Number> f27436w;

    /* JADX INFO: renamed from: x */
    public static final TypeAdapterFactory f27437x;

    /* JADX INFO: renamed from: y */
    public static final TypeAdapter2<Character> f27438y;

    /* JADX INFO: renamed from: z */
    public static final TypeAdapterFactory f27439z;

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$a */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class a extends TypeAdapter2<AtomicIntegerArray> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public AtomicIntegerArray mo12212a(JsonReader2 jsonReader2) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader2.mo12241a();
            while (jsonReader2.mo12236O()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader2.mo12245n0()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
            jsonReader2.mo12247u();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            jsonWriter.mo12255c();
            int length = atomicIntegerArray2.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.mo12257n0(atomicIntegerArray2.get(i));
            }
            jsonWriter.mo12259u();
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$a0 */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class a0 extends TypeAdapter2<Number> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Number mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader2.mo12245n0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.mo12260u0(number);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$b */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class b extends TypeAdapter2<Number> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Number mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            try {
                return Long.valueOf(jsonReader2.mo12246t0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.mo12260u0(number);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$b0 */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class b0 extends TypeAdapter2<Number> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Number mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader2.mo12245n0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.mo12260u0(number);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$c */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class c extends TypeAdapter2<Number> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Number mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader2.mo12244g0());
            }
            jsonReader2.mo12249z0();
            return null;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.mo12260u0(number);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$c0 */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class c0 extends TypeAdapter2<AtomicInteger> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public AtomicInteger mo12212a(JsonReader2 jsonReader2) throws IOException {
            try {
                return new AtomicInteger(jsonReader2.mo12245n0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.mo12257n0(atomicInteger.get());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$d */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class d extends TypeAdapter2<Number> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Number mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() != JsonToken.NULL) {
                return Double.valueOf(jsonReader2.mo12244g0());
            }
            jsonReader2.mo12249z0();
            return null;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.mo12260u0(number);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$d0 */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class d0 extends TypeAdapter2<AtomicBoolean> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public AtomicBoolean mo12212a(JsonReader2 jsonReader2) throws IOException {
            return new AtomicBoolean(jsonReader2.mo12243f0());
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.mo12262z0(atomicBoolean.get());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$e */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class e extends TypeAdapter2<Number> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Number mo12212a(JsonReader2 jsonReader2) throws IOException {
            JsonToken jsonTokenMo12234H0 = jsonReader2.mo12234H0();
            int iOrdinal = jsonTokenMo12234H0.ordinal();
            if (iOrdinal == 5 || iOrdinal == 6) {
                return new LazilyParsedNumber(jsonReader2.mo12232F0());
            }
            if (iOrdinal == 8) {
                jsonReader2.mo12249z0();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + jsonTokenMo12234H0);
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.mo12260u0(number);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$e0 */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public static final class e0<T extends Enum<T>> extends TypeAdapter2<T> {

        /* JADX INFO: renamed from: a */
        public final Map<String, T> f27440a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Map<T, String> f27441b = new HashMap();

        public e0(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String strName = t.name();
                    SerializedName serializedName = (SerializedName) cls.getField(strName).getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        strName = serializedName.value();
                        for (String str : serializedName.alternate()) {
                            this.f27440a.put(str, t);
                        }
                    }
                    this.f27440a.put(strName, t);
                    this.f27441b.put(t, strName);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Object mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() != JsonToken.NULL) {
                return this.f27440a.get(jsonReader2.mo12232F0());
            }
            jsonReader2.mo12249z0();
            return null;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            jsonWriter.mo12261x0(r3 == null ? null : this.f27441b.get(r3));
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$f */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class f extends TypeAdapter2<Character> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Character mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            String strMo12232F0 = jsonReader2.mo12232F0();
            if (strMo12232F0.length() == 1) {
                return Character.valueOf(strMo12232F0.charAt(0));
            }
            throw new JsonSyntaxException(outline.m1599u("Expecting character, got: ", strMo12232F0));
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Character ch) throws IOException {
            Character ch2 = ch;
            jsonWriter.mo12261x0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$g */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class g extends TypeAdapter2<String> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public String mo12212a(JsonReader2 jsonReader2) throws IOException {
            JsonToken jsonTokenMo12234H0 = jsonReader2.mo12234H0();
            if (jsonTokenMo12234H0 != JsonToken.NULL) {
                return jsonTokenMo12234H0 == JsonToken.BOOLEAN ? Boolean.toString(jsonReader2.mo12243f0()) : jsonReader2.mo12232F0();
            }
            jsonReader2.mo12249z0();
            return null;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.mo12261x0(str);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$h */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class h extends TypeAdapter2<BigDecimal> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public BigDecimal mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            try {
                return new BigDecimal(jsonReader2.mo12232F0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.mo12260u0(bigDecimal);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$i */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class i extends TypeAdapter2<BigInteger> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public BigInteger mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            try {
                return new BigInteger(jsonReader2.mo12232F0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.mo12260u0(bigInteger);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$j */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class j extends TypeAdapter2<StringBuilder> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public StringBuilder mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() != JsonToken.NULL) {
                return new StringBuilder(jsonReader2.mo12232F0());
            }
            jsonReader2.mo12249z0();
            return null;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
            StringBuilder sb2 = sb;
            jsonWriter.mo12261x0(sb2 == null ? null : sb2.toString());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$k */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class k extends TypeAdapter2<Class> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Class mo12212a(JsonReader2 jsonReader2) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Class cls) throws IOException {
            StringBuilder sbM1556G = outline.m1556G("Attempted to serialize java.lang.Class: ");
            sbM1556G.append(cls.getName());
            sbM1556G.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sbM1556G.toString());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$l */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class l extends TypeAdapter2<StringBuffer> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public StringBuffer mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() != JsonToken.NULL) {
                return new StringBuffer(jsonReader2.mo12232F0());
            }
            jsonReader2.mo12249z0();
            return null;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            StringBuffer stringBuffer2 = stringBuffer;
            jsonWriter.mo12261x0(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$m */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class m extends TypeAdapter2<URL> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public URL mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            String strMo12232F0 = jsonReader2.mo12232F0();
            if ("null".equals(strMo12232F0)) {
                return null;
            }
            return new URL(strMo12232F0);
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, URL url) throws IOException {
            URL url2 = url;
            jsonWriter.mo12261x0(url2 == null ? null : url2.toExternalForm());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$n */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class n extends TypeAdapter2<URI> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public URI mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            try {
                String strMo12232F0 = jsonReader2.mo12232F0();
                if ("null".equals(strMo12232F0)) {
                    return null;
                }
                return new URI(strMo12232F0);
            } catch (URISyntaxException e) {
                throw new JsonIOException(e);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, URI uri) throws IOException {
            URI uri2 = uri;
            jsonWriter.mo12261x0(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$o */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class o extends TypeAdapter2<InetAddress> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public InetAddress mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() != JsonToken.NULL) {
                return InetAddress.getByName(jsonReader2.mo12232F0());
            }
            jsonReader2.mo12249z0();
            return null;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            InetAddress inetAddress2 = inetAddress;
            jsonWriter.mo12261x0(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$p */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class p extends TypeAdapter2<UUID> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public UUID mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() != JsonToken.NULL) {
                return UUID.fromString(jsonReader2.mo12232F0());
            }
            jsonReader2.mo12249z0();
            return null;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, UUID uuid) throws IOException {
            UUID uuid2 = uuid;
            jsonWriter.mo12261x0(uuid2 == null ? null : uuid2.toString());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$q */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class q extends TypeAdapter2<Currency> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Currency mo12212a(JsonReader2 jsonReader2) throws IOException {
            return Currency.getInstance(jsonReader2.mo12232F0());
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.mo12261x0(currency.getCurrencyCode());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$r */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class r implements TypeAdapterFactory {

        /* JADX INFO: renamed from: c.n.e.e0.a0.o$r$a */
        /* JADX INFO: compiled from: TypeAdapters.java */
        public class a extends TypeAdapter2<Timestamp> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TypeAdapter2 f27442a;

            public a(r rVar, TypeAdapter2 typeAdapter2) {
                this.f27442a = typeAdapter2;
            }

            @Override // p007c.p190n.p430e.TypeAdapter2
            /* JADX INFO: renamed from: a */
            public Timestamp mo12212a(JsonReader2 jsonReader2) throws IOException {
                Date date = (Date) this.f27442a.mo12212a(jsonReader2);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // p007c.p190n.p430e.TypeAdapter2
            /* JADX INFO: renamed from: b */
            public void mo12213b(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                this.f27442a.mo12213b(jsonWriter, timestamp);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapterFactory
        /* JADX INFO: renamed from: a */
        public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
            if (typeToken.f27513a != Timestamp.class) {
                return null;
            }
            Objects.requireNonNull(gson6);
            return new a(this, gson6.m12316c(new TypeToken<>(Date.class)));
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$s */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class s extends TypeAdapter2<Calendar> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Calendar mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            jsonReader2.mo12242c();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (jsonReader2.mo12234H0() != JsonToken.END_OBJECT) {
                String strMo12248u0 = jsonReader2.mo12248u0();
                int iMo12245n0 = jsonReader2.mo12245n0();
                if (CainMediaMetadataRetriever.METADATA_KEY_YEAR.equals(strMo12248u0)) {
                    i = iMo12245n0;
                } else if ("month".equals(strMo12248u0)) {
                    i2 = iMo12245n0;
                } else if ("dayOfMonth".equals(strMo12248u0)) {
                    i3 = iMo12245n0;
                } else if ("hourOfDay".equals(strMo12248u0)) {
                    i4 = iMo12245n0;
                } else if ("minute".equals(strMo12248u0)) {
                    i5 = iMo12245n0;
                } else if ("second".equals(strMo12248u0)) {
                    i6 = iMo12245n0;
                }
            }
            jsonReader2.mo12231B();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Calendar calendar) throws IOException {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                jsonWriter.mo12254O();
                return;
            }
            jsonWriter.mo12256f();
            jsonWriter.mo12251D(CainMediaMetadataRetriever.METADATA_KEY_YEAR);
            jsonWriter.mo12257n0(calendar2.get(1));
            jsonWriter.mo12251D("month");
            jsonWriter.mo12257n0(calendar2.get(2));
            jsonWriter.mo12251D("dayOfMonth");
            jsonWriter.mo12257n0(calendar2.get(5));
            jsonWriter.mo12251D("hourOfDay");
            jsonWriter.mo12257n0(calendar2.get(11));
            jsonWriter.mo12251D("minute");
            jsonWriter.mo12257n0(calendar2.get(12));
            jsonWriter.mo12251D("second");
            jsonWriter.mo12257n0(calendar2.get(13));
            jsonWriter.mo12250B();
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$t */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class t extends TypeAdapter2<Locale> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Locale mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader2.mo12232F0(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Locale locale) throws IOException {
            Locale locale2 = locale;
            jsonWriter.mo12261x0(locale2 == null ? null : locale2.toString());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$u */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class u extends TypeAdapter2<JsonElement> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public JsonElement mo12212a(JsonReader2 jsonReader2) throws IOException {
            int iOrdinal = jsonReader2.mo12234H0().ordinal();
            if (iOrdinal == 0) {
                JsonArray jsonArray = new JsonArray();
                jsonReader2.mo12241a();
                while (jsonReader2.mo12236O()) {
                    JsonElement jsonElementMo12212a = mo12212a(jsonReader2);
                    if (jsonElementMo12212a == null) {
                        jsonElementMo12212a = JsonNull.f27581a;
                    }
                    jsonArray.f27580f.add(jsonElementMo12212a);
                }
                jsonReader2.mo12247u();
                return jsonArray;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 5) {
                    return new JsonPrimitive(jsonReader2.mo12232F0());
                }
                if (iOrdinal == 6) {
                    return new JsonPrimitive(new LazilyParsedNumber(jsonReader2.mo12232F0()));
                }
                if (iOrdinal == 7) {
                    return new JsonPrimitive(Boolean.valueOf(jsonReader2.mo12243f0()));
                }
                if (iOrdinal != 8) {
                    throw new IllegalArgumentException();
                }
                jsonReader2.mo12249z0();
                return JsonNull.f27581a;
            }
            JsonObject jsonObject = new JsonObject();
            jsonReader2.mo12242c();
            while (jsonReader2.mo12236O()) {
                String strMo12248u0 = jsonReader2.mo12248u0();
                JsonElement jsonElementMo12212a2 = mo12212a(jsonReader2);
                LinkedTreeMap<String, JsonElement> linkedTreeMap = jsonObject.f27582a;
                if (jsonElementMo12212a2 == null) {
                    jsonElementMo12212a2 = JsonNull.f27581a;
                }
                linkedTreeMap.put(strMo12248u0, jsonElementMo12212a2);
            }
            jsonReader2.mo12231B();
            return jsonObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo12213b(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
            if (jsonElement == null || (jsonElement instanceof JsonNull)) {
                jsonWriter.mo12254O();
                return;
            }
            if (jsonElement instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitiveM12325c = jsonElement.m12325c();
                Object obj = jsonPrimitiveM12325c.f27583a;
                if (obj instanceof Number) {
                    jsonWriter.mo12260u0(jsonPrimitiveM12325c.m12328h());
                    return;
                } else if (obj instanceof Boolean) {
                    jsonWriter.mo12262z0(jsonPrimitiveM12325c.m12327f());
                    return;
                } else {
                    jsonWriter.mo12261x0(jsonPrimitiveM12325c.m12329j());
                    return;
                }
            }
            boolean z = jsonElement instanceof JsonArray;
            if (z) {
                jsonWriter.mo12255c();
                if (!z) {
                    throw new IllegalStateException("Not a JSON Array: " + jsonElement);
                }
                Iterator<JsonElement> it = ((JsonArray) jsonElement).iterator();
                while (it.hasNext()) {
                    mo12213b(jsonWriter, it.next());
                }
                jsonWriter.mo12259u();
                return;
            }
            boolean z2 = jsonElement instanceof JsonObject;
            if (!z2) {
                StringBuilder sbM1556G = outline.m1556G("Couldn't write ");
                sbM1556G.append(jsonElement.getClass());
                throw new IllegalArgumentException(sbM1556G.toString());
            }
            jsonWriter.mo12256f();
            if (!z2) {
                throw new IllegalStateException("Not a JSON Object: " + jsonElement);
            }
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            LinkedTreeMap.e eVar = linkedTreeMap.f27491k.f27503i;
            int i = linkedTreeMap.f27490j;
            while (true) {
                LinkedTreeMap.e eVar2 = linkedTreeMap.f27491k;
                if (!(eVar != eVar2)) {
                    jsonWriter.mo12250B();
                    return;
                }
                if (eVar == eVar2) {
                    throw new NoSuchElementException();
                }
                if (linkedTreeMap.f27490j != i) {
                    throw new ConcurrentModificationException();
                }
                LinkedTreeMap.e eVar3 = eVar.f27503i;
                jsonWriter.mo12251D((String) eVar.f27505k);
                mo12213b(jsonWriter, (JsonElement) eVar.f27506l);
                eVar = eVar3;
            }
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$v */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class v extends TypeAdapter2<BitSet> {
        /* JADX WARN: Code duplicated, block: B:20:0x004b  */
        /* JADX WARN: Code duplicated, block: B:21:0x004d  */
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public BitSet mo12212a(JsonReader2 jsonReader2) throws IOException {
            boolean zMo12243f0;
            BitSet bitSet = new BitSet();
            jsonReader2.mo12241a();
            JsonToken jsonTokenMo12234H0 = jsonReader2.mo12234H0();
            int i = 0;
            while (jsonTokenMo12234H0 != JsonToken.END_ARRAY) {
                int iOrdinal = jsonTokenMo12234H0.ordinal();
                if (iOrdinal == 5) {
                    String strMo12232F0 = jsonReader2.mo12232F0();
                    try {
                        if (Integer.parseInt(strMo12232F0) != 0) {
                            zMo12243f0 = true;
                        } else {
                            zMo12243f0 = false;
                        }
                    } catch (NumberFormatException unused) {
                        throw new JsonSyntaxException(outline.m1599u("Error: Expecting: bitset number value (1, 0), Found: ", strMo12232F0));
                    }
                } else if (iOrdinal != 6) {
                    if (iOrdinal != 7) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + jsonTokenMo12234H0);
                    }
                    zMo12243f0 = jsonReader2.mo12243f0();
                } else if (jsonReader2.mo12245n0() != 0) {
                    zMo12243f0 = true;
                } else {
                    zMo12243f0 = false;
                }
                if (zMo12243f0) {
                    bitSet.set(i);
                }
                i++;
                jsonTokenMo12234H0 = jsonReader2.mo12234H0();
            }
            jsonReader2.mo12247u();
            return bitSet;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            jsonWriter.mo12255c();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.mo12257n0(bitSet2.get(i) ? 1L : 0L);
            }
            jsonWriter.mo12259u();
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$w */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class w implements TypeAdapterFactory {
        @Override // p007c.p190n.p430e.TypeAdapterFactory
        /* JADX INFO: renamed from: a */
        public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
            Class<? super T> superclass = typeToken.f27513a;
            if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                return null;
            }
            if (!superclass.isEnum()) {
                superclass = superclass.getSuperclass();
            }
            return new e0(superclass);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$x */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class x extends TypeAdapter2<Boolean> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Boolean mo12212a(JsonReader2 jsonReader2) throws IOException {
            JsonToken jsonTokenMo12234H0 = jsonReader2.mo12234H0();
            if (jsonTokenMo12234H0 != JsonToken.NULL) {
                return jsonTokenMo12234H0 == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader2.mo12232F0())) : Boolean.valueOf(jsonReader2.mo12243f0());
            }
            jsonReader2.mo12249z0();
            return null;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.mo12258t0(bool);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$y */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class y extends TypeAdapter2<Boolean> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Boolean mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader2.mo12232F0());
            }
            jsonReader2.mo12249z0();
            return null;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Boolean bool) throws IOException {
            Boolean bool2 = bool;
            jsonWriter.mo12261x0(bool2 == null ? "null" : bool2.toString());
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.o$z */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class z extends TypeAdapter2<Number> {
        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Number mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader2.mo12245n0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.mo12260u0(number);
        }
    }

    static {
        TypeAdapter typeAdapter = new TypeAdapter(new k());
        f27414a = typeAdapter;
        f27415b = new TypeAdapters2(Class.class, typeAdapter);
        TypeAdapter typeAdapter2 = new TypeAdapter(new v());
        f27416c = typeAdapter2;
        f27417d = new TypeAdapters2(BitSet.class, typeAdapter2);
        x xVar = new x();
        f27418e = xVar;
        f27419f = new y();
        f27420g = new TypeAdapters3(Boolean.TYPE, Boolean.class, xVar);
        z zVar = new z();
        f27421h = zVar;
        f27422i = new TypeAdapters3(Byte.TYPE, Byte.class, zVar);
        a0 a0Var = new a0();
        f27423j = a0Var;
        f27424k = new TypeAdapters3(Short.TYPE, Short.class, a0Var);
        b0 b0Var = new b0();
        f27425l = b0Var;
        f27426m = new TypeAdapters3(Integer.TYPE, Integer.class, b0Var);
        TypeAdapter typeAdapter3 = new TypeAdapter(new c0());
        f27427n = typeAdapter3;
        f27428o = new TypeAdapters2(AtomicInteger.class, typeAdapter3);
        TypeAdapter typeAdapter4 = new TypeAdapter(new d0());
        f27429p = typeAdapter4;
        f27430q = new TypeAdapters2(AtomicBoolean.class, typeAdapter4);
        TypeAdapter typeAdapter5 = new TypeAdapter(new a());
        f27431r = typeAdapter5;
        f27432s = new TypeAdapters2(AtomicIntegerArray.class, typeAdapter5);
        f27433t = new b();
        f27434u = new c();
        f27435v = new d();
        e eVar = new e();
        f27436w = eVar;
        f27437x = new TypeAdapters2(Number.class, eVar);
        f fVar = new f();
        f27438y = fVar;
        f27439z = new TypeAdapters3(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        f27388A = gVar;
        f27389B = new h();
        f27390C = new i();
        f27391D = new TypeAdapters2(String.class, gVar);
        j jVar = new j();
        f27392E = jVar;
        f27393F = new TypeAdapters2(StringBuilder.class, jVar);
        l lVar = new l();
        f27394G = lVar;
        f27395H = new TypeAdapters2(StringBuffer.class, lVar);
        m mVar = new m();
        f27396I = mVar;
        f27397J = new TypeAdapters2(URL.class, mVar);
        n nVar = new n();
        f27398K = nVar;
        f27399L = new TypeAdapters2(URI.class, nVar);
        o oVar = new o();
        f27400M = oVar;
        f27401N = new TypeAdapters5(InetAddress.class, oVar);
        p pVar = new p();
        f27402O = pVar;
        f27403P = new TypeAdapters2(UUID.class, pVar);
        TypeAdapter typeAdapter6 = new TypeAdapter(new q());
        f27404Q = typeAdapter6;
        f27405R = new TypeAdapters2(Currency.class, typeAdapter6);
        f27406S = new r();
        s sVar = new s();
        f27407T = sVar;
        f27408U = new TypeAdapters4(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        f27409V = tVar;
        f27410W = new TypeAdapters2(Locale.class, tVar);
        u uVar = new u();
        f27411X = uVar;
        f27412Y = new TypeAdapters5(JsonElement.class, uVar);
        f27413Z = new w();
    }
}
