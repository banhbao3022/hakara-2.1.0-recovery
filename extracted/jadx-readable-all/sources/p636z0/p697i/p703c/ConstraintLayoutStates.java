package p636z0.p697i.p703c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: z0.i.c.c, reason: use source file name */
/* JADX INFO: compiled from: ConstraintLayoutStates.java */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayoutStates {

    /* JADX INFO: renamed from: a */
    public SparseArray<a> f37033a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public SparseArray<ConstraintSet> f37034b = new SparseArray<>();

    /* JADX INFO: renamed from: z0.i.c.c$a */
    /* JADX INFO: compiled from: ConstraintLayoutStates.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f37035a;

        /* JADX INFO: renamed from: b */
        public ArrayList<b> f37036b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public int f37037c;

        /* JADX INFO: renamed from: d */
        public ConstraintSet f37038d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f37037c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8022i.f37171i);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f37035a = typedArrayObtainStyledAttributes.getResourceId(index, this.f37035a);
                } else if (index == 1) {
                    this.f37037c = typedArrayObtainStyledAttributes.getResourceId(index, this.f37037c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f37037c);
                    context.getResources().getResourceName(this.f37037c);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f37038d = constraintSet;
                        constraintSet.m15851b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f37037c, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: z0.i.c.c$b */
    /* JADX INFO: compiled from: ConstraintLayoutStates.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public float f37039a;

        /* JADX INFO: renamed from: b */
        public float f37040b;

        /* JADX INFO: renamed from: c */
        public float f37041c;

        /* JADX INFO: renamed from: d */
        public float f37042d;

        /* JADX INFO: renamed from: e */
        public int f37043e;

        /* JADX INFO: renamed from: f */
        public ConstraintSet f37044f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f37039a = Float.NaN;
            this.f37040b = Float.NaN;
            this.f37041c = Float.NaN;
            this.f37042d = Float.NaN;
            this.f37043e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8022i.f37173k);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f37043e = typedArrayObtainStyledAttributes.getResourceId(index, this.f37043e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f37043e);
                    context.getResources().getResourceName(this.f37043e);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f37044f = constraintSet;
                        constraintSet.m15851b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f37043e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f37042d = typedArrayObtainStyledAttributes.getDimension(index, this.f37042d);
                } else if (index == 2) {
                    this.f37040b = typedArrayObtainStyledAttributes.getDimension(index, this.f37040b);
                } else if (index == 3) {
                    this.f37041c = typedArrayObtainStyledAttributes.getDimension(index, this.f37041c);
                } else if (index == 4) {
                    this.f37039a = typedArrayObtainStyledAttributes.getDimension(index, this.f37039a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    byte b2 = -1;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b2 = 4;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = 2;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b2 = 1;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b2 = 0;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b2 = 3;
                            }
                            break;
                    }
                    if (b2 != 0 && b2 != 1) {
                        if (b2 == 2) {
                            aVar = new a(context, xml);
                            this.f37033a.put(aVar.f37035a, aVar);
                        } else if (b2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.f37036b.add(bVar);
                            }
                        } else if (b2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m15849a(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX INFO: renamed from: a */
    public final void m15849a(Context context, XmlPullParser xmlPullParser) {
        ConstraintSet.a aVarM15853d;
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlPullParser.getEventType();
                    ConstraintSet.a aVar = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlPullParser.getName();
                        } else if (eventType == 2) {
                            switch (xmlPullParser.getName()) {
                                case "Constraint":
                                    aVarM15853d = constraintSet.m15853d(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                case "Guideline":
                                    aVarM15853d = constraintSet.m15853d(context, Xml.asAttributeSet(xmlPullParser));
                                    ConstraintSet.b bVar = aVarM15853d.f37053d;
                                    bVar.f37084b = true;
                                    bVar.f37086c = true;
                                    break;
                                case "Barrier":
                                    aVarM15853d = constraintSet.m15853d(context, Xml.asAttributeSet(xmlPullParser));
                                    aVarM15853d.f37053d.f37091e0 = 1;
                                    break;
                                case "PropertySet":
                                    if (aVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    aVar.f37051b.m15860a(context, Xml.asAttributeSet(xmlPullParser));
                                    continue;
                                    break;
                                    break;
                                case "Transform":
                                    if (aVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    aVar.f37054e.m15861a(context, Xml.asAttributeSet(xmlPullParser));
                                    continue;
                                    break;
                                    break;
                                case "Layout":
                                    if (aVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    aVar.f37053d.m15858a(context, Xml.asAttributeSet(xmlPullParser));
                                    continue;
                                    break;
                                    break;
                                case "Motion":
                                    if (aVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    aVar.f37052c.m15859a(context, Xml.asAttributeSet(xmlPullParser));
                                    continue;
                                    break;
                                    break;
                                case "CustomAttribute":
                                    if (aVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    ConstraintAttribute.m15838a(context, xmlPullParser, aVar.f37055f);
                                    continue;
                                    break;
                                    break;
                                default:
                                    continue;
                                    break;
                            }
                            aVar = aVarM15853d;
                        } else if (eventType != 3) {
                            continue;
                        } else {
                            String name = xmlPullParser.getName();
                            if ("ConstraintSet".equals(name)) {
                                this.f37034b.put(identifier, constraintSet);
                                return;
                            } else if (name.equalsIgnoreCase("Constraint")) {
                                constraintSet.f37049e.put(Integer.valueOf(aVar.f37050a), aVar);
                                aVar = null;
                            }
                        }
                        eventType = xmlPullParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                this.f37034b.put(identifier, constraintSet);
                return;
            }
        }
    }
}
