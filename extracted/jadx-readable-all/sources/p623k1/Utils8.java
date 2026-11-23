package p623k1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p509g1.ResponseBody;
import p524h1.Buffer3;

/* JADX INFO: renamed from: k1.e0, reason: use source file name */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class Utils8 {

    /* JADX INFO: renamed from: a */
    public static final Type[] f33137a = new Type[0];

    /* JADX INFO: renamed from: k1.e0$a */
    /* JADX INFO: compiled from: Utils.java */
    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: f */
        public final Type f33138f;

        public a(Type type) {
            this.f33138f = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && Utils8.m14283c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f33138f;
        }

        public int hashCode() {
            return this.f33138f.hashCode();
        }

        public String toString() {
            return Utils8.m14296p(this.f33138f) + "[]";
        }
    }

    /* JADX INFO: renamed from: k1.e0$b */
    /* JADX INFO: compiled from: Utils.java */
    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: f */
        public final Type f33139f;

        /* JADX INFO: renamed from: g */
        public final Type f33140g;

        /* JADX INFO: renamed from: h */
        public final Type[] f33141h;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                Utils8.m14282b(type3);
            }
            this.f33139f = type;
            this.f33140g = type2;
            this.f33141h = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && Utils8.m14283c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f33141h.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f33139f;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f33140g;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f33141h) ^ this.f33140g.hashCode();
            Type type = this.f33139f;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f33141h;
            if (typeArr.length == 0) {
                return Utils8.m14296p(this.f33140g);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(Utils8.m14296p(this.f33140g));
            sb.append("<");
            sb.append(Utils8.m14296p(this.f33141h[0]));
            for (int i = 1; i < this.f33141h.length; i++) {
                sb.append(", ");
                sb.append(Utils8.m14296p(this.f33141h[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: k1.e0$c */
    /* JADX INFO: compiled from: Utils.java */
    public static final class c implements WildcardType {

        /* JADX INFO: renamed from: f */
        public final Type f33142f;

        /* JADX INFO: renamed from: g */
        public final Type f33143g;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                Utils8.m14282b(typeArr[0]);
                this.f33143g = null;
                this.f33142f = typeArr[0];
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            Utils8.m14282b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f33143g = typeArr2[0];
            this.f33142f = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && Utils8.m14283c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f33143g;
            return type != null ? new Type[]{type} : Utils8.f33137a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f33142f};
        }

        public int hashCode() {
            Type type = this.f33143g;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f33142f.hashCode() + 31);
        }

        public String toString() {
            if (this.f33143g != null) {
                StringBuilder sbM1556G = outline.m1556G("? super ");
                sbM1556G.append(Utils8.m14296p(this.f33143g));
                return sbM1556G.toString();
            }
            if (this.f33142f == Object.class) {
                return "?";
            }
            StringBuilder sbM1556G2 = outline.m1556G("? extends ");
            sbM1556G2.append(Utils8.m14296p(this.f33142f));
            return sbM1556G2.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static ResponseBody m14281a(ResponseBody responseBody) throws IOException {
        Buffer3 buffer3 = new Buffer3();
        responseBody.source().mo13752r0(buffer3);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer3);
    }

    /* JADX INFO: renamed from: b */
    public static void m14282b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14283c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m14283c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: d */
    public static Type m14284d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m14284d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m14284d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: e */
    public static Type m14285e(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM1557H = outline.m1557H("Index ", i, " not in range [0,");
        sbM1557H.append(actualTypeArguments.length);
        sbM1557H.append(") for ");
        sbM1557H.append(parameterizedType);
        throw new IllegalArgumentException(sbM1557H.toString());
    }

    /* JADX INFO: renamed from: f */
    public static Class<?> m14286f(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m14286f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m14286f(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* JADX INFO: renamed from: g */
    public static Type m14287g(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m14294n(type, cls, m14284d(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14288h(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m14288h(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m14288h(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m14289i(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static RuntimeException m14290j(Method method, String str, Object... objArr) {
        return m14291k(method, null, str, objArr);
    }

    /* JADX INFO: renamed from: k */
    public static RuntimeException m14291k(Method method, Throwable th, String str, Object... objArr) {
        StringBuilder sbM1561L = outline.m1561L(String.format(str, objArr), "\n    for method ");
        sbM1561L.append(method.getDeclaringClass().getSimpleName());
        sbM1561L.append(".");
        sbM1561L.append(method.getName());
        return new IllegalArgumentException(sbM1561L.toString(), th);
    }

    /* JADX INFO: renamed from: l */
    public static RuntimeException m14292l(Method method, int i, String str, Object... objArr) {
        StringBuilder sbM1561L = outline.m1561L(str, " (parameter #");
        sbM1561L.append(i + 1);
        sbM1561L.append(")");
        return m14290j(method, sbM1561L.toString(), objArr);
    }

    /* JADX INFO: renamed from: m */
    public static RuntimeException m14293m(Method method, Throwable th, int i, String str, Object... objArr) {
        StringBuilder sbM1561L = outline.m1561L(str, " (parameter #");
        sbM1561L.append(i + 1);
        sbM1561L.append(")");
        return m14291k(method, th, sbM1561L.toString(), objArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX INFO: renamed from: n */
    public static Type m14294n(Type type, Class<?> cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeM14294n = m14294n(type, cls, componentType);
                        return componentType == typeM14294n ? cls2 : new a(typeM14294n);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeM14294n2 = m14294n(type, cls, genericComponentType);
                    return genericComponentType == typeM14294n2 ? genericArrayType : new a(typeM14294n2);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeM14294n3 = m14294n(type, cls, ownerType);
                    boolean z = typeM14294n3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeM14294n4 = m14294n(type, cls, actualTypeArguments[i]);
                        if (typeM14294n4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeM14294n4;
                        }
                        i++;
                    }
                    return z ? new b(typeM14294n3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM14294n5 = m14294n(type, cls, lowerBounds[0]);
                        if (typeM14294n5 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new c(new Type[]{Object.class}, new Type[]{typeM14294n5});
                        }
                    } else if (upperBounds.length == 1) {
                        type3 = type5;
                        type3 = wildcardType;
                        Type typeM14294n6 = m14294n(type, cls, upperBounds[0]);
                        type3 = wildcardType;
                        if (typeM14294n6 != upperBounds[0]) {
                            return new c(new Type[]{typeM14294n6}, f33137a);
                        }
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeM14284d = m14284d(type, cls, cls3);
                if (typeM14284d instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type4 = ((ParameterizedType) typeM14284d).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m14295o(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m14296p(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
