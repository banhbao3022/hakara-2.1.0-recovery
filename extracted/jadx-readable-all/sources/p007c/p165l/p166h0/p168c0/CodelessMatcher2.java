package p007c.p165l.p166h0.p168c0;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p168c0.p169p.EventBinding;
import p007c.p165l.p166h0.p168c0.p169p.ParameterComponent;
import p007c.p165l.p166h0.p168c0.p169p.PathComponent;
import p007c.p165l.p166h0.p168c0.p169p.ViewHierarchy;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.c0.g, reason: use source file name */
/* JADX INFO: compiled from: CodelessMatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class CodelessMatcher2 {

    /* JADX INFO: renamed from: a */
    public static final String f4633a = "c.l.h0.c0.g";

    /* JADX INFO: renamed from: b */
    public static CodelessMatcher2 f4634b;

    /* JADX INFO: renamed from: c */
    public final Handler f4635c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public Set<Activity> f4636d = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: e */
    public Set<b> f4637e = new HashSet();

    /* JADX INFO: renamed from: f */
    public HashSet<String> f4638f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    public HashMap<Integer, HashSet<String>> f4639g = new HashMap<>();

    /* JADX INFO: renamed from: c.l.h0.c0.g$a */
    /* JADX INFO: compiled from: CodelessMatcher.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public WeakReference<View> f4640a;

        /* JADX INFO: renamed from: b */
        public String f4641b;

        public a(View view, String str) {
            this.f4640a = new WeakReference<>(view);
            this.f4641b = str;
        }

        /* JADX INFO: renamed from: a */
        public View m2291a() {
            WeakReference<View> weakReference = this.f4640a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    /* JADX INFO: renamed from: c.l.h0.c0.g$b */
    /* JADX INFO: compiled from: CodelessMatcher.java */
    public static class b implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: f */
        public WeakReference<View> f4642f;

        /* JADX INFO: renamed from: g */
        public List<EventBinding> f4643g;

        /* JADX INFO: renamed from: h */
        public final Handler f4644h;

        /* JADX INFO: renamed from: i */
        public HashSet<String> f4645i;

        /* JADX INFO: renamed from: j */
        public final String f4646j;

        public b(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f4642f = new WeakReference<>(view);
            this.f4644h = handler;
            this.f4645i = hashSet;
            this.f4646j = str;
            handler.postDelayed(this, 200L);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:50:0x0100  */
        /* JADX WARN: Code duplicated, block: B:53:0x0116  */
        /* JADX WARN: Code duplicated, block: B:56:0x011d  */
        /* JADX WARN: Code duplicated, block: B:58:0x0123  */
        /* JADX WARN: Code duplicated, block: B:60:0x0137  */
        /* JADX WARN: Code duplicated, block: B:63:0x013e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0144  */
        /* JADX WARN: Code duplicated, block: B:67:0x014c  */
        /* JADX WARN: Code duplicated, block: B:68:0x014e  */
        /* JADX WARN: Code duplicated, block: B:71:0x0164  */
        /* JADX WARN: Code duplicated, block: B:73:0x016a  */
        /* JADX INFO: renamed from: a */
        public static List<a> m2292a(EventBinding eventBinding, View view, List<PathComponent> list, int i, int i2, String str) {
            boolean z;
            String str2;
            String strValueOf;
            String str3;
            String strM2303g;
            String str4;
            String strValueOf2;
            String str5;
            String strM2304h;
            StringBuilder sbM1561L = outline.m1561L(str, ".");
            sbM1561L.append(String.valueOf(i2));
            String string = sbM1561L.toString();
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new a(view, string));
            } else {
                PathComponent pathComponent = list.get(i);
                if (pathComponent.f4681a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ArrayList arrayList2 = (ArrayList) m2293b((ViewGroup) parent);
                        int size = arrayList2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(m2292a(eventBinding, (View) arrayList2.get(i3), list, i + 1, i3, string));
                        }
                    }
                    return arrayList;
                }
                if (pathComponent.f4681a.equals(".")) {
                    arrayList.add(new a(view, string));
                    return arrayList;
                }
                int i4 = pathComponent.f4682b;
                if (i4 != -1 && i2 != i4) {
                    z = false;
                } else if (!view.getClass().getCanonicalName().equals(pathComponent.f4681a)) {
                    if (pathComponent.f4681a.matches(".*android\\..*")) {
                        String[] strArrSplit = pathComponent.f4681a.split("\\.");
                        if (strArrSplit.length > 0) {
                            if (view.getClass().getSimpleName().equals(strArrSplit[strArrSplit.length - 1])) {
                                if ((pathComponent.f4688h & 1) <= 0) {
                                    if ((pathComponent.f4688h & 2) > 0) {
                                        str5 = pathComponent.f4684d;
                                        strM2304h = ViewHierarchy.m2304h(view);
                                        String strM2446e = Utility.m2446e(Utility.m2440M(strM2304h), "");
                                        if (!str5.equals(strM2304h)) {
                                            if ((pathComponent.f4688h & 8) > 0) {
                                                str4 = pathComponent.f4686f;
                                                if (view.getContentDescription() == null) {
                                                    strValueOf2 = "";
                                                } else {
                                                    strValueOf2 = String.valueOf(view.getContentDescription());
                                                }
                                                String strM2446e2 = Utility.m2446e(Utility.m2440M(strValueOf2), "");
                                                if (!str4.equals(strValueOf2)) {
                                                    if ((pathComponent.f4688h & 16) > 0) {
                                                        str3 = pathComponent.f4687g;
                                                        strM2303g = ViewHierarchy.m2303g(view);
                                                        String strM2446e3 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                                        if (str3.equals(strM2303g)) {
                                                            if ((pathComponent.f4688h & 4) > 0) {
                                                                str2 = pathComponent.f4685e;
                                                                if (view.getTag() == null) {
                                                                    strValueOf = "";
                                                                } else {
                                                                    strValueOf = String.valueOf(view.getTag());
                                                                }
                                                                String strM2446e4 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                                if (str2.equals(strValueOf)) {
                                                                }
                                                            }
                                                            z = true;
                                                        } else {
                                                            if ((pathComponent.f4688h & 4) > 0) {
                                                                str2 = pathComponent.f4685e;
                                                                if (view.getTag() == null) {
                                                                    strValueOf = "";
                                                                } else {
                                                                    strValueOf = String.valueOf(view.getTag());
                                                                }
                                                                String strM2446e5 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                                if (str2.equals(strValueOf)) {
                                                                }
                                                            }
                                                            z = true;
                                                        }
                                                    } else {
                                                        if ((pathComponent.f4688h & 4) > 0) {
                                                            str2 = pathComponent.f4685e;
                                                            if (view.getTag() == null) {
                                                                strValueOf = "";
                                                            } else {
                                                                strValueOf = String.valueOf(view.getTag());
                                                            }
                                                            String strM2446e6 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                            if (str2.equals(strValueOf)) {
                                                            }
                                                        }
                                                        z = true;
                                                    }
                                                } else if ((pathComponent.f4688h & 16) > 0) {
                                                    str3 = pathComponent.f4687g;
                                                    strM2303g = ViewHierarchy.m2303g(view);
                                                    String strM2446e7 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                                    if (str3.equals(strM2303g)) {
                                                        if ((pathComponent.f4688h & 4) > 0) {
                                                            str2 = pathComponent.f4685e;
                                                            if (view.getTag() == null) {
                                                                strValueOf = "";
                                                            } else {
                                                                strValueOf = String.valueOf(view.getTag());
                                                            }
                                                            String strM2446e8 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                            if (str2.equals(strValueOf)) {
                                                            }
                                                        }
                                                        z = true;
                                                    } else {
                                                        if ((pathComponent.f4688h & 4) > 0) {
                                                            str2 = pathComponent.f4685e;
                                                            if (view.getTag() == null) {
                                                                strValueOf = "";
                                                            } else {
                                                                strValueOf = String.valueOf(view.getTag());
                                                            }
                                                            String strM2446e9 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                            if (str2.equals(strValueOf)) {
                                                            }
                                                        }
                                                        z = true;
                                                    }
                                                } else {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e10 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                }
                                            } else if ((pathComponent.f4688h & 16) > 0) {
                                                str3 = pathComponent.f4687g;
                                                strM2303g = ViewHierarchy.m2303g(view);
                                                String strM2446e11 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                                if (str3.equals(strM2303g)) {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e12 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                } else {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e13 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                }
                                            } else {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e14 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            }
                                        } else if ((pathComponent.f4688h & 8) > 0) {
                                            str4 = pathComponent.f4686f;
                                            if (view.getContentDescription() == null) {
                                                strValueOf2 = "";
                                            } else {
                                                strValueOf2 = String.valueOf(view.getContentDescription());
                                            }
                                            String strM2446e15 = Utility.m2446e(Utility.m2440M(strValueOf2), "");
                                            if (!str4.equals(strValueOf2)) {
                                                if ((pathComponent.f4688h & 16) > 0) {
                                                    str3 = pathComponent.f4687g;
                                                    strM2303g = ViewHierarchy.m2303g(view);
                                                    String strM2446e16 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                                    if (str3.equals(strM2303g)) {
                                                        if ((pathComponent.f4688h & 4) > 0) {
                                                            str2 = pathComponent.f4685e;
                                                            if (view.getTag() == null) {
                                                                strValueOf = "";
                                                            } else {
                                                                strValueOf = String.valueOf(view.getTag());
                                                            }
                                                            String strM2446e17 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                            if (str2.equals(strValueOf)) {
                                                            }
                                                        }
                                                        z = true;
                                                    } else {
                                                        if ((pathComponent.f4688h & 4) > 0) {
                                                            str2 = pathComponent.f4685e;
                                                            if (view.getTag() == null) {
                                                                strValueOf = "";
                                                            } else {
                                                                strValueOf = String.valueOf(view.getTag());
                                                            }
                                                            String strM2446e18 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                            if (str2.equals(strValueOf)) {
                                                            }
                                                        }
                                                        z = true;
                                                    }
                                                } else {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e19 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                }
                                            } else if ((pathComponent.f4688h & 16) > 0) {
                                                str3 = pathComponent.f4687g;
                                                strM2303g = ViewHierarchy.m2303g(view);
                                                String strM2446e110 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                                if (str3.equals(strM2303g)) {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e111 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                } else {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e112 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                }
                                            } else {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e113 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            }
                                        } else if ((pathComponent.f4688h & 16) > 0) {
                                            str3 = pathComponent.f4687g;
                                            strM2303g = ViewHierarchy.m2303g(view);
                                            String strM2446e114 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                            if (str3.equals(strM2303g)) {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e115 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            } else {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e116 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            }
                                        } else {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e117 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        }
                                    } else if ((pathComponent.f4688h & 8) > 0) {
                                        str4 = pathComponent.f4686f;
                                        if (view.getContentDescription() == null) {
                                            strValueOf2 = "";
                                        } else {
                                            strValueOf2 = String.valueOf(view.getContentDescription());
                                        }
                                        String strM2446e118 = Utility.m2446e(Utility.m2440M(strValueOf2), "");
                                        if (!str4.equals(strValueOf2)) {
                                            if ((pathComponent.f4688h & 16) > 0) {
                                                str3 = pathComponent.f4687g;
                                                strM2303g = ViewHierarchy.m2303g(view);
                                                String strM2446e119 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                                if (str3.equals(strM2303g)) {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e1110 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                } else {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e1111 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                }
                                            } else {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e1112 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            }
                                        } else if ((pathComponent.f4688h & 16) > 0) {
                                            str3 = pathComponent.f4687g;
                                            strM2303g = ViewHierarchy.m2303g(view);
                                            String strM2446e1113 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                            if (str3.equals(strM2303g)) {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e1114 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            } else {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e1115 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            }
                                        } else {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e1116 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        }
                                    } else if ((pathComponent.f4688h & 16) > 0) {
                                        str3 = pathComponent.f4687g;
                                        strM2303g = ViewHierarchy.m2303g(view);
                                        String strM2446e1117 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                        if (str3.equals(strM2303g)) {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e1118 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        } else {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e1119 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        }
                                    } else {
                                        if ((pathComponent.f4688h & 4) > 0) {
                                            str2 = pathComponent.f4685e;
                                            if (view.getTag() == null) {
                                                strValueOf = "";
                                            } else {
                                                strValueOf = String.valueOf(view.getTag());
                                            }
                                            String strM2446e11110 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                            if (str2.equals(strValueOf)) {
                                            }
                                        }
                                        z = true;
                                    }
                                } else if ((pathComponent.f4688h & 2) > 0) {
                                    str5 = pathComponent.f4684d;
                                    strM2304h = ViewHierarchy.m2304h(view);
                                    String strM2446e20 = Utility.m2446e(Utility.m2440M(strM2304h), "");
                                    if (!str5.equals(strM2304h)) {
                                        if ((pathComponent.f4688h & 8) > 0) {
                                            str4 = pathComponent.f4686f;
                                            if (view.getContentDescription() == null) {
                                                strValueOf2 = "";
                                            } else {
                                                strValueOf2 = String.valueOf(view.getContentDescription());
                                            }
                                            String strM2446e1120 = Utility.m2446e(Utility.m2440M(strValueOf2), "");
                                            if (!str4.equals(strValueOf2)) {
                                                if ((pathComponent.f4688h & 16) > 0) {
                                                    str3 = pathComponent.f4687g;
                                                    strM2303g = ViewHierarchy.m2303g(view);
                                                    String strM2446e11111 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                                    if (str3.equals(strM2303g)) {
                                                        if ((pathComponent.f4688h & 4) > 0) {
                                                            str2 = pathComponent.f4685e;
                                                            if (view.getTag() == null) {
                                                                strValueOf = "";
                                                            } else {
                                                                strValueOf = String.valueOf(view.getTag());
                                                            }
                                                            String strM2446e11112 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                            if (str2.equals(strValueOf)) {
                                                            }
                                                        }
                                                        z = true;
                                                    } else {
                                                        if ((pathComponent.f4688h & 4) > 0) {
                                                            str2 = pathComponent.f4685e;
                                                            if (view.getTag() == null) {
                                                                strValueOf = "";
                                                            } else {
                                                                strValueOf = String.valueOf(view.getTag());
                                                            }
                                                            String strM2446e11113 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                            if (str2.equals(strValueOf)) {
                                                            }
                                                        }
                                                        z = true;
                                                    }
                                                } else {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e11114 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                }
                                            } else if ((pathComponent.f4688h & 16) > 0) {
                                                str3 = pathComponent.f4687g;
                                                strM2303g = ViewHierarchy.m2303g(view);
                                                String strM2446e11115 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                                if (str3.equals(strM2303g)) {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e11116 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                } else {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e11117 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                }
                                            } else {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e11118 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            }
                                        } else if ((pathComponent.f4688h & 16) > 0) {
                                            str3 = pathComponent.f4687g;
                                            strM2303g = ViewHierarchy.m2303g(view);
                                            String strM2446e11119 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                            if (str3.equals(strM2303g)) {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e111110 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            } else {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e111111 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            }
                                        } else {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e111112 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        }
                                    } else if ((pathComponent.f4688h & 8) > 0) {
                                        str4 = pathComponent.f4686f;
                                        if (view.getContentDescription() == null) {
                                            strValueOf2 = "";
                                        } else {
                                            strValueOf2 = String.valueOf(view.getContentDescription());
                                        }
                                        String strM2446e1121 = Utility.m2446e(Utility.m2440M(strValueOf2), "");
                                        if (!str4.equals(strValueOf2)) {
                                            if ((pathComponent.f4688h & 16) > 0) {
                                                str3 = pathComponent.f4687g;
                                                strM2303g = ViewHierarchy.m2303g(view);
                                                String strM2446e111113 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                                if (str3.equals(strM2303g)) {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e111114 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                } else {
                                                    if ((pathComponent.f4688h & 4) > 0) {
                                                        str2 = pathComponent.f4685e;
                                                        if (view.getTag() == null) {
                                                            strValueOf = "";
                                                        } else {
                                                            strValueOf = String.valueOf(view.getTag());
                                                        }
                                                        String strM2446e111115 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                        if (str2.equals(strValueOf)) {
                                                        }
                                                    }
                                                    z = true;
                                                }
                                            } else {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e111116 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            }
                                        } else if ((pathComponent.f4688h & 16) > 0) {
                                            str3 = pathComponent.f4687g;
                                            strM2303g = ViewHierarchy.m2303g(view);
                                            String strM2446e111117 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                            if (str3.equals(strM2303g)) {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e111118 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            } else {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e111119 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            }
                                        } else {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e1111110 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        }
                                    } else if ((pathComponent.f4688h & 16) > 0) {
                                        str3 = pathComponent.f4687g;
                                        strM2303g = ViewHierarchy.m2303g(view);
                                        String strM2446e1111111 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                        if (str3.equals(strM2303g)) {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e1111112 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        } else {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e1111113 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        }
                                    } else {
                                        if ((pathComponent.f4688h & 4) > 0) {
                                            str2 = pathComponent.f4685e;
                                            if (view.getTag() == null) {
                                                strValueOf = "";
                                            } else {
                                                strValueOf = String.valueOf(view.getTag());
                                            }
                                            String strM2446e1111114 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                            if (str2.equals(strValueOf)) {
                                            }
                                        }
                                        z = true;
                                    }
                                } else if ((pathComponent.f4688h & 8) > 0) {
                                    str4 = pathComponent.f4686f;
                                    if (view.getContentDescription() == null) {
                                        strValueOf2 = "";
                                    } else {
                                        strValueOf2 = String.valueOf(view.getContentDescription());
                                    }
                                    String strM2446e1122 = Utility.m2446e(Utility.m2440M(strValueOf2), "");
                                    if (!str4.equals(strValueOf2)) {
                                        if ((pathComponent.f4688h & 16) > 0) {
                                            str3 = pathComponent.f4687g;
                                            strM2303g = ViewHierarchy.m2303g(view);
                                            String strM2446e1111115 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                            if (str3.equals(strM2303g)) {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e1111116 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            } else {
                                                if ((pathComponent.f4688h & 4) > 0) {
                                                    str2 = pathComponent.f4685e;
                                                    if (view.getTag() == null) {
                                                        strValueOf = "";
                                                    } else {
                                                        strValueOf = String.valueOf(view.getTag());
                                                    }
                                                    String strM2446e1111117 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                    if (str2.equals(strValueOf)) {
                                                    }
                                                }
                                                z = true;
                                            }
                                        } else {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e1111118 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        }
                                    } else if ((pathComponent.f4688h & 16) > 0) {
                                        str3 = pathComponent.f4687g;
                                        strM2303g = ViewHierarchy.m2303g(view);
                                        String strM2446e1111119 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                        if (str3.equals(strM2303g)) {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e11111110 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        } else {
                                            if ((pathComponent.f4688h & 4) > 0) {
                                                str2 = pathComponent.f4685e;
                                                if (view.getTag() == null) {
                                                    strValueOf = "";
                                                } else {
                                                    strValueOf = String.valueOf(view.getTag());
                                                }
                                                String strM2446e11111111 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                                if (str2.equals(strValueOf)) {
                                                }
                                            }
                                            z = true;
                                        }
                                    } else {
                                        if ((pathComponent.f4688h & 4) > 0) {
                                            str2 = pathComponent.f4685e;
                                            if (view.getTag() == null) {
                                                strValueOf = "";
                                            } else {
                                                strValueOf = String.valueOf(view.getTag());
                                            }
                                            String strM2446e11111112 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                            if (str2.equals(strValueOf)) {
                                            }
                                        }
                                        z = true;
                                    }
                                } else if ((pathComponent.f4688h & 16) > 0) {
                                    str3 = pathComponent.f4687g;
                                    strM2303g = ViewHierarchy.m2303g(view);
                                    String strM2446e11111113 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                                    if (str3.equals(strM2303g)) {
                                        if ((pathComponent.f4688h & 4) > 0) {
                                            str2 = pathComponent.f4685e;
                                            if (view.getTag() == null) {
                                                strValueOf = "";
                                            } else {
                                                strValueOf = String.valueOf(view.getTag());
                                            }
                                            String strM2446e11111114 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                            if (str2.equals(strValueOf)) {
                                            }
                                        }
                                        z = true;
                                    } else {
                                        if ((pathComponent.f4688h & 4) > 0) {
                                            str2 = pathComponent.f4685e;
                                            if (view.getTag() == null) {
                                                strValueOf = "";
                                            } else {
                                                strValueOf = String.valueOf(view.getTag());
                                            }
                                            String strM2446e11111115 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                            if (str2.equals(strValueOf)) {
                                            }
                                        }
                                        z = true;
                                    }
                                } else {
                                    if ((pathComponent.f4688h & 4) > 0) {
                                        str2 = pathComponent.f4685e;
                                        if (view.getTag() == null) {
                                            strValueOf = "";
                                        } else {
                                            strValueOf = String.valueOf(view.getTag());
                                        }
                                        String strM2446e11111116 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                        if (str2.equals(strValueOf)) {
                                        }
                                    }
                                    z = true;
                                }
                            }
                        }
                    }
                    z = false;
                } else if ((pathComponent.f4688h & 1) <= 0 && pathComponent.f4683c != view.getId()) {
                    z = false;
                } else if ((pathComponent.f4688h & 2) > 0) {
                    str5 = pathComponent.f4684d;
                    strM2304h = ViewHierarchy.m2304h(view);
                    String strM2446e21 = Utility.m2446e(Utility.m2440M(strM2304h), "");
                    if (!str5.equals(strM2304h) && !str5.equals(strM2446e21)) {
                        z = false;
                    } else if ((pathComponent.f4688h & 8) > 0) {
                        str4 = pathComponent.f4686f;
                        if (view.getContentDescription() == null) {
                            strValueOf2 = "";
                        } else {
                            strValueOf2 = String.valueOf(view.getContentDescription());
                        }
                        String strM2446e1123 = Utility.m2446e(Utility.m2440M(strValueOf2), "");
                        if (!str4.equals(strValueOf2) && !str4.equals(strM2446e1123)) {
                            z = false;
                        } else if ((pathComponent.f4688h & 16) > 0) {
                            str3 = pathComponent.f4687g;
                            strM2303g = ViewHierarchy.m2303g(view);
                            String strM2446e11111117 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                            if (str3.equals(strM2303g) || str3.equals(strM2446e11111117)) {
                                if ((pathComponent.f4688h & 4) > 0) {
                                    str2 = pathComponent.f4685e;
                                    if (view.getTag() == null) {
                                        strValueOf = "";
                                    } else {
                                        strValueOf = String.valueOf(view.getTag());
                                    }
                                    String strM2446e11111118 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                    if (str2.equals(strValueOf) && !str2.equals(strM2446e11111118)) {
                                        z = false;
                                    }
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            if ((pathComponent.f4688h & 4) > 0) {
                                str2 = pathComponent.f4685e;
                                if (view.getTag() == null) {
                                    strValueOf = "";
                                } else {
                                    strValueOf = String.valueOf(view.getTag());
                                }
                                String strM2446e11111119 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                if (str2.equals(strValueOf)) {
                                }
                            }
                            z = true;
                        }
                    } else if ((pathComponent.f4688h & 16) > 0) {
                        str3 = pathComponent.f4687g;
                        strM2303g = ViewHierarchy.m2303g(view);
                        String strM2446e111111110 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                        if (str3.equals(strM2303g)) {
                            if ((pathComponent.f4688h & 4) > 0) {
                                str2 = pathComponent.f4685e;
                                if (view.getTag() == null) {
                                    strValueOf = "";
                                } else {
                                    strValueOf = String.valueOf(view.getTag());
                                }
                                String strM2446e111111111 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                if (str2.equals(strValueOf)) {
                                }
                            }
                            z = true;
                        } else {
                            if ((pathComponent.f4688h & 4) > 0) {
                                str2 = pathComponent.f4685e;
                                if (view.getTag() == null) {
                                    strValueOf = "";
                                } else {
                                    strValueOf = String.valueOf(view.getTag());
                                }
                                String strM2446e111111112 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                if (str2.equals(strValueOf)) {
                                }
                            }
                            z = true;
                        }
                    } else {
                        if ((pathComponent.f4688h & 4) > 0) {
                            str2 = pathComponent.f4685e;
                            if (view.getTag() == null) {
                                strValueOf = "";
                            } else {
                                strValueOf = String.valueOf(view.getTag());
                            }
                            String strM2446e111111113 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                            if (str2.equals(strValueOf)) {
                            }
                        }
                        z = true;
                    }
                } else if ((pathComponent.f4688h & 8) > 0) {
                    str4 = pathComponent.f4686f;
                    if (view.getContentDescription() == null) {
                        strValueOf2 = "";
                    } else {
                        strValueOf2 = String.valueOf(view.getContentDescription());
                    }
                    String strM2446e1124 = Utility.m2446e(Utility.m2440M(strValueOf2), "");
                    if (!str4.equals(strValueOf2)) {
                        if ((pathComponent.f4688h & 16) > 0) {
                            str3 = pathComponent.f4687g;
                            strM2303g = ViewHierarchy.m2303g(view);
                            String strM2446e111111114 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                            if (str3.equals(strM2303g)) {
                                if ((pathComponent.f4688h & 4) > 0) {
                                    str2 = pathComponent.f4685e;
                                    if (view.getTag() == null) {
                                        strValueOf = "";
                                    } else {
                                        strValueOf = String.valueOf(view.getTag());
                                    }
                                    String strM2446e111111115 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                    if (str2.equals(strValueOf)) {
                                    }
                                }
                                z = true;
                            } else {
                                if ((pathComponent.f4688h & 4) > 0) {
                                    str2 = pathComponent.f4685e;
                                    if (view.getTag() == null) {
                                        strValueOf = "";
                                    } else {
                                        strValueOf = String.valueOf(view.getTag());
                                    }
                                    String strM2446e111111116 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                    if (str2.equals(strValueOf)) {
                                    }
                                }
                                z = true;
                            }
                        } else {
                            if ((pathComponent.f4688h & 4) > 0) {
                                str2 = pathComponent.f4685e;
                                if (view.getTag() == null) {
                                    strValueOf = "";
                                } else {
                                    strValueOf = String.valueOf(view.getTag());
                                }
                                String strM2446e111111117 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                if (str2.equals(strValueOf)) {
                                }
                            }
                            z = true;
                        }
                    } else if ((pathComponent.f4688h & 16) > 0) {
                        str3 = pathComponent.f4687g;
                        strM2303g = ViewHierarchy.m2303g(view);
                        String strM2446e111111118 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                        if (str3.equals(strM2303g)) {
                            if ((pathComponent.f4688h & 4) > 0) {
                                str2 = pathComponent.f4685e;
                                if (view.getTag() == null) {
                                    strValueOf = "";
                                } else {
                                    strValueOf = String.valueOf(view.getTag());
                                }
                                String strM2446e111111119 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                if (str2.equals(strValueOf)) {
                                }
                            }
                            z = true;
                        } else {
                            if ((pathComponent.f4688h & 4) > 0) {
                                str2 = pathComponent.f4685e;
                                if (view.getTag() == null) {
                                    strValueOf = "";
                                } else {
                                    strValueOf = String.valueOf(view.getTag());
                                }
                                String strM2446e1111111110 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                                if (str2.equals(strValueOf)) {
                                }
                            }
                            z = true;
                        }
                    } else {
                        if ((pathComponent.f4688h & 4) > 0) {
                            str2 = pathComponent.f4685e;
                            if (view.getTag() == null) {
                                strValueOf = "";
                            } else {
                                strValueOf = String.valueOf(view.getTag());
                            }
                            String strM2446e1111111111 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                            if (str2.equals(strValueOf)) {
                            }
                        }
                        z = true;
                    }
                } else if ((pathComponent.f4688h & 16) > 0) {
                    str3 = pathComponent.f4687g;
                    strM2303g = ViewHierarchy.m2303g(view);
                    String strM2446e1111111112 = Utility.m2446e(Utility.m2440M(strM2303g), "");
                    if (str3.equals(strM2303g)) {
                        if ((pathComponent.f4688h & 4) > 0) {
                            str2 = pathComponent.f4685e;
                            if (view.getTag() == null) {
                                strValueOf = "";
                            } else {
                                strValueOf = String.valueOf(view.getTag());
                            }
                            String strM2446e1111111113 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                            if (str2.equals(strValueOf)) {
                            }
                        }
                        z = true;
                    } else {
                        if ((pathComponent.f4688h & 4) > 0) {
                            str2 = pathComponent.f4685e;
                            if (view.getTag() == null) {
                                strValueOf = "";
                            } else {
                                strValueOf = String.valueOf(view.getTag());
                            }
                            String strM2446e1111111114 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                            if (str2.equals(strValueOf)) {
                            }
                        }
                        z = true;
                    }
                } else {
                    if ((pathComponent.f4688h & 4) > 0) {
                        str2 = pathComponent.f4685e;
                        if (view.getTag() == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(view.getTag());
                        }
                        String strM2446e1111111115 = Utility.m2446e(Utility.m2440M(strValueOf), "");
                        if (str2.equals(strValueOf)) {
                        }
                    }
                    z = true;
                }
                if (!z) {
                    return arrayList;
                }
                if (i == list.size() - 1) {
                    arrayList.add(new a(view, string));
                }
            }
            if (view instanceof ViewGroup) {
                ArrayList arrayList3 = (ArrayList) m2293b((ViewGroup) view);
                int size2 = arrayList3.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList.addAll(m2292a(eventBinding, (View) arrayList3.get(i5), list, i + 1, i5, string));
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public static List<View> m2293b(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: c */
        public final void m2294c() {
            AdapterView adapterView;
            if (this.f4643g == null || this.f4642f.get() == null) {
                return;
            }
            for (int i = 0; i < this.f4643g.size(); i++) {
                EventBinding eventBinding = this.f4643g.get(i);
                View view = this.f4642f.get();
                if (eventBinding != null && view != null && (TextUtils.isEmpty(eventBinding.f4669d) || eventBinding.f4669d.equals(this.f4646j))) {
                    List listUnmodifiableList = Collections.unmodifiableList(eventBinding.f4667b);
                    if (listUnmodifiableList.size() <= 25) {
                        for (a aVar : (ArrayList) m2292a(eventBinding, view, listUnmodifiableList, 0, -1, this.f4646j)) {
                            try {
                                View viewM2291a = aVar.m2291a();
                                if (viewM2291a != null) {
                                    String str = ViewHierarchy.f4689a;
                                    View view2 = viewM2291a;
                                    while (true) {
                                        if (view2 != null) {
                                            if (view2.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                                                break;
                                            }
                                            Object parent = view2.getParent();
                                            if (parent instanceof View) {
                                                view2 = (View) parent;
                                            }
                                        }
                                        view2 = null;
                                        break;
                                    }
                                    boolean z = true;
                                    if (view2 != null && ViewHierarchy.m2305i(viewM2291a, view2)) {
                                        View viewM2291a2 = aVar.m2291a();
                                        if (viewM2291a2 != null) {
                                            String str2 = aVar.f4641b;
                                            View.OnTouchListener onTouchListenerM2302f = ViewHierarchy.m2302f(viewM2291a2);
                                            if (!(onTouchListenerM2302f instanceof RCTCodelessLoggingEventListener2) || !((RCTCodelessLoggingEventListener2) onTouchListenerM2302f).f4653j) {
                                                z = false;
                                            }
                                            if (!this.f4645i.contains(str2) && !z) {
                                                viewM2291a2.setOnTouchListener(new RCTCodelessLoggingEventListener2(eventBinding, view, viewM2291a2));
                                                this.f4645i.add(str2);
                                            }
                                        }
                                    } else if (!viewM2291a.getClass().getName().startsWith("com.facebook.react")) {
                                        if (!(viewM2291a instanceof AdapterView)) {
                                            View viewM2291a3 = aVar.m2291a();
                                            if (viewM2291a3 != null) {
                                                String str3 = aVar.f4641b;
                                                View.OnClickListener onClickListenerM2301e = ViewHierarchy.m2301e(viewM2291a3);
                                                if (!(onClickListenerM2301e instanceof CodelessLoggingEventListener2.a) || !((CodelessLoggingEventListener2.a) onClickListenerM2301e).f4616j) {
                                                    z = false;
                                                }
                                                if (!this.f4645i.contains(str3) && !z) {
                                                    viewM2291a3.setOnClickListener(new CodelessLoggingEventListener2.a(eventBinding, view, viewM2291a3, null));
                                                    this.f4645i.add(str3);
                                                }
                                            }
                                        } else if ((viewM2291a instanceof ListView) && (adapterView = (AdapterView) aVar.m2291a()) != null) {
                                            String str4 = aVar.f4641b;
                                            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                                            if (!(onItemClickListener instanceof CodelessLoggingEventListener2.b) || !((CodelessLoggingEventListener2.b) onItemClickListener).f4621j) {
                                                z = false;
                                            }
                                            if (!this.f4645i.contains(str4) && !z) {
                                                adapterView.setOnItemClickListener(new CodelessLoggingEventListener2.b(eventBinding, view, adapterView, null));
                                                this.f4645i.add(str4);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                String str5 = CodelessMatcher2.f4633a;
                                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                            }
                        }
                    }
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m2294c();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            m2294c();
        }

        @Override // java.lang.Runnable
        public void run() {
            int length;
            View view;
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            FetchedAppSettings fetchedAppSettingsM2524b = FetchedAppSettingsManager.m2524b(FacebookSdk.f5354c);
            if (fetchedAppSettingsM2524b == null || !fetchedAppSettingsM2524b.f5008h) {
                return;
            }
            JSONArray jSONArray = fetchedAppSettingsM2524b.f5010j;
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    length = jSONArray.length();
                } catch (IllegalArgumentException | JSONException unused) {
                }
            } else {
                length = 0;
            }
            for (int i = 0; i < length; i++) {
                arrayList.add(EventBinding.m2295a(jSONArray.getJSONObject(i)));
            }
            this.f4643g = arrayList;
            if (arrayList == null || (view = this.f4642f.get()) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            }
            m2294c();
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized CodelessMatcher2 m2288a() {
        if (f4634b == null) {
            f4634b = new CodelessMatcher2();
        }
        return f4634b;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m2289b(EventBinding eventBinding, View view, View view2) {
        List<ParameterComponent> listUnmodifiableList;
        Bundle bundle = new Bundle();
        if (eventBinding != null && (listUnmodifiableList = Collections.unmodifiableList(eventBinding.f4668c)) != null) {
            for (ParameterComponent parameterComponent : listUnmodifiableList) {
                String str = parameterComponent.f4678b;
                if (str != null && str.length() > 0) {
                    bundle.putString(parameterComponent.f4677a, parameterComponent.f4678b);
                } else if (parameterComponent.f4679c.size() > 0) {
                    for (a aVar : parameterComponent.f4680d.equals("relative") ? b.m2292a(eventBinding, view2, parameterComponent.f4679c, 0, -1, view2.getClass().getSimpleName()) : b.m2292a(eventBinding, view, parameterComponent.f4679c, 0, -1, view.getClass().getSimpleName())) {
                        if (aVar.m2291a() != null) {
                            String strM2304h = ViewHierarchy.m2304h(aVar.m2291a());
                            if (strM2304h.length() > 0) {
                                bundle.putString(parameterComponent.f4677a, strM2304h);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public final void m2290c() {
        for (Activity activity : this.f4636d) {
            if (activity != null) {
                this.f4637e.add(new b(activity.getWindow().getDecorView().getRootView(), this.f4635c, this.f4638f, activity.getClass().getSimpleName()));
            }
        }
    }
}
