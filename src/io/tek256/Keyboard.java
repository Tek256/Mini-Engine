
package io.tek256;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;

import static org.lwjgl.glfw.GLFW.*;

public class Keyboard {
	public static final int KEY_SPACE         = GLFW_KEY_SPACE;
    public static final int KEY_APOSTROPHE    = GLFW_KEY_APOSTROPHE;
    public static final int KEY_COMMA         = GLFW_KEY_COMMA;
    public static final int KEY_MINUS         = GLFW_KEY_MINUS;
    public static final int KEY_PERIOD        = GLFW_KEY_PERIOD;
    public static final int KEY_SLASH         = GLFW_KEY_SLASH;
    public static final int KEY_0             = GLFW_KEY_0;
    public static final int KEY_1             = GLFW_KEY_1;
    public static final int KEY_2             = GLFW_KEY_2;
    public static final int KEY_3             = GLFW_KEY_3;
    public static final int KEY_4             = GLFW_KEY_4;
    public static final int KEY_5             = GLFW_KEY_5;
    public static final int KEY_6             = GLFW_KEY_6;
    public static final int KEY_7             = GLFW_KEY_7;
    public static final int KEY_8             = GLFW_KEY_8;
    public static final int KEY_9             = GLFW_KEY_9;
    public static final int KEY_SEMICOLON     = GLFW_KEY_SEMICOLON;
    public static final int KEY_EQUAL         = GLFW_KEY_EQUAL;
    public static final int KEY_A             = GLFW_KEY_A;
    public static final int KEY_B             = GLFW_KEY_B;
    public static final int KEY_C             = GLFW_KEY_C;
    public static final int KEY_D             = GLFW_KEY_D;
    public static final int KEY_E             = GLFW_KEY_E;
    public static final int KEY_F             = GLFW_KEY_F;
    public static final int KEY_G             = GLFW_KEY_G;
    public static final int KEY_H             = GLFW_KEY_H;
    public static final int KEY_I             = GLFW_KEY_I;
    public static final int KEY_J             = GLFW_KEY_J;
    public static final int KEY_K             = GLFW_KEY_K;
    public static final int KEY_L             = GLFW_KEY_L;
    public static final int KEY_M             = GLFW_KEY_M;
    public static final int KEY_N             = GLFW_KEY_N;
    public static final int KEY_O             = GLFW_KEY_O;
    public static final int KEY_P             = GLFW_KEY_P;
    public static final int KEY_Q             = GLFW_KEY_Q;
    public static final int KEY_R             = GLFW_KEY_R;
    public static final int KEY_S             = GLFW_KEY_S;
    public static final int KEY_T             = GLFW_KEY_T;
    public static final int KEY_U             = GLFW_KEY_U;
    public static final int KEY_V             = GLFW_KEY_V;
    public static final int KEY_W             = GLFW_KEY_W;
    public static final int KEY_X             = GLFW_KEY_X;
    public static final int KEY_Y             = GLFW_KEY_Y;
    public static final int KEY_Z             = GLFW_KEY_Z;
    public static final int KEY_LEFT_BRACKET  = GLFW_KEY_LEFT_BRACKET;
    public static final int KEY_BACKSLASH     = GLFW_KEY_BACKSLASH;
    public static final int KEY_RIGHT_BRACKET = GLFW_KEY_RIGHT_BRACKET;
    public static final int KEY_GRAVE_ACCENT  = GLFW_KEY_GRAVE_ACCENT;
    public static final int KEY_WORLD_1       = GLFW_KEY_WORLD_1;
    public static final int KEY_WORLD_2       = GLFW_KEY_WORLD_2; // FUNCTION KEYS ----
    public static final int KEY_ESCAPE        = GLFW_KEY_ESCAPE;
    public static final int KEY_ENTER         = GLFW_KEY_ENTER;
    public static final int KEY_TAB           = GLFW_KEY_TAB;
    public static final int KEY_BACKSPACE     = GLFW_KEY_BACKSPACE;
    public static final int KEY_INSERT        = GLFW_KEY_INSERT;
    public static final int KEY_DELETE        = GLFW_KEY_DELETE;
    public static final int KEY_RIGHT         = GLFW_KEY_RIGHT;
    public static final int KEY_LEFT          = GLFW_KEY_LEFT;
    public static final int KEY_DOWN          = GLFW_KEY_DOWN;
    public static final int KEY_UP            = GLFW_KEY_UP;
    public static final int KEY_PAGE_UP       = GLFW_KEY_PAGE_UP;
    public static final int KEY_PAGE_DOWN     = GLFW_KEY_PAGE_DOWN;
    public static final int KEY_HOME          = GLFW_KEY_HOME;
    public static final int KEY_END           = GLFW_KEY_END;
    public static final int KEY_CAPS_LOCK     = GLFW_KEY_CAPS_LOCK;
    public static final int KEY_SCROLL_LOCK   = GLFW_KEY_SCROLL_LOCK;
    public static final int KEY_NUM_LOCK      = GLFW_KEY_NUM_LOCK;
    public static final int KEY_PRINT_SCREEN  = GLFW_KEY_PRINT_SCREEN;
    public static final int KEY_PAUSE         = GLFW_KEY_PAUSE;
    public static final int KEY_F1            = GLFW_KEY_F1;
    public static final int KEY_F2            = GLFW_KEY_F2;
    public static final int KEY_F3            = GLFW_KEY_F3;
    public static final int KEY_F4            = GLFW_KEY_F4;
    public static final int KEY_F5            = GLFW_KEY_F5;
    public static final int KEY_F6            = GLFW_KEY_F6;
    public static final int KEY_F7            = GLFW_KEY_F7;
    public static final int KEY_F8            = GLFW_KEY_F8;
    public static final int KEY_F9            = GLFW_KEY_F9;
    public static final int KEY_F10           = GLFW_KEY_F10;
    public static final int KEY_F11           = GLFW_KEY_F11;
    public static final int KEY_F12           = GLFW_KEY_F12;
    public static final int KEY_F13           = GLFW_KEY_F13;
    public static final int KEY_F14           = GLFW_KEY_F14;
    public static final int KEY_F15           = GLFW_KEY_F15;
    public static final int KEY_F16           = GLFW_KEY_F16;
    public static final int KEY_F17           = GLFW_KEY_F17;
    public static final int KEY_F18           = GLFW_KEY_F18;
    public static final int KEY_F19           = GLFW_KEY_F19;
    public static final int KEY_F20           = GLFW_KEY_F20;
    public static final int KEY_F21           = GLFW_KEY_F21;
    public static final int KEY_F22           = GLFW_KEY_F22;
    public static final int KEY_F23           = GLFW_KEY_F23;
    public static final int KEY_F24           = GLFW_KEY_F24;
    public static final int KEY_F25           = GLFW_KEY_F25;
    public static final int KEY_KP_0          = GLFW_KEY_KP_0;
    public static final int KEY_KP_1          = GLFW_KEY_KP_1;
    public static final int KEY_KP_2          = GLFW_KEY_KP_2;
    public static final int KEY_KP_3          = GLFW_KEY_KP_3;
    public static final int KEY_KP_4          = GLFW_KEY_KP_4;
    public static final int KEY_KP_5          = GLFW_KEY_KP_5;
    public static final int KEY_KP_6          = GLFW_KEY_KP_6;
    public static final int KEY_KP_7          = GLFW_KEY_KP_7;
    public static final int KEY_KP_8          = GLFW_KEY_KP_8;
    public static final int KEY_KP_9          = GLFW_KEY_KP_9;
    public static final int KEY_KP_DECIMAL    = GLFW_KEY_KP_DECIMAL;
    public static final int KEY_KP_DIVIDE     = GLFW_KEY_KP_DIVIDE;
    public static final int KEY_KP_MULTIPLY   = GLFW_KEY_KP_MULTIPLY;
    public static final int KEY_KP_SUBTRACT   = GLFW_KEY_KP_SUBTRACT;
    public static final int KEY_KP_ADD        = GLFW_KEY_KP_ADD;
    public static final int KEY_KP_ENTER      = GLFW_KEY_KP_ENTER;
    public static final int KEY_KP_EQUAL      = GLFW_KEY_KP_EQUAL;
    public static final int KEY_LEFT_SHIFT    = GLFW_KEY_LEFT_SHIFT;
    public static final int KEY_LEFT_CONTROL  = GLFW_KEY_LEFT_CONTROL;
    public static final int KEY_LEFT_ALT      = GLFW_KEY_LEFT_ALT;
    public static final int KEY_LEFT_SUPER    = GLFW_KEY_LEFT_SUPER;
    public static final int KEY_RIGHT_SHIFT   = GLFW_KEY_RIGHT_SHIFT;
    public static final int KEY_RIGHT_CONTROL = GLFW_KEY_RIGHT_CONTROL;
    public static final int KEY_RIGHT_ALT     = GLFW_KEY_RIGHT_ALT;
    public static final int KEY_RIGHT_SUPER   = GLFW_KEY_RIGHT_SUPER;
    public static final int KEY_MENU          = GLFW_KEY_MENU;
    public static final int KEY_LAST          = GLFW_KEY_LAST;

	public static int[] MODIFIERS = {
		GLFW_KEY_LEFT_SHIFT,
		GLFW_KEY_RIGHT_SHIFT,
		GLFW_KEY_LEFT_ALT,
		GLFW_KEY_RIGHT_ALT,
		GLFW_KEY_LEFT_CONTROL,
		GLFW_KEY_RIGHT_CONTROL,
		GLFW_KEY_LEFT_SUPER,
		GLFW_KEY_RIGHT_SUPER
	};
	
	private static ArrayList<Integer> events;
	private static ArrayList<Integer> eventsThisFrame;
	private static ArrayList<Integer> eventsLastFrame;
	
	private static HashMap<String,Button> buttons;
	
	public Keyboard(){
		events = new ArrayList<>();
		eventsThisFrame = new ArrayList<>();
		eventsLastFrame = new ArrayList<>();
		buttons = new HashMap<String,Button>();
	}
	
	public static void update(){
		eventsLastFrame.clear();
		eventsLastFrame.addAll(eventsThisFrame);
		eventsThisFrame.clear();
		eventsThisFrame.addAll(events);
	}
	
	public static void addButton(String name, Button button){
		buttons.put(name, button);
	}
	
	public static void removeButton(Button button){
		buttons.remove(button);
	}
	
	public static float getButton(String name){
		if(buttons.containsKey(name))
			return buttons.get(name).getValue();
		return 0f;
	}
	
	protected static void setKey(char c, boolean pressed){
		setKey((int)Character.toUpperCase(c),pressed);
	}
	
	protected static void setKey(int key, boolean pressed){
		if(pressed && !events.contains(key))
			events.add(key);
		else if(!pressed && events.contains(key))
			events.remove((Integer)key);
	}
	
	public static boolean isPressed(int key){
		return events.contains(key);
	}
	
	public static boolean isPressed(int key, int...mods){
		for(int mod: mods)
			if(!isPressed(mod))
				return false;
		return isPressed(key);
	}
	
	public static boolean isReleased(int key){
		return !isPressed(key);
	}
	
	public static boolean isClicked(int key){
		if(eventsThisFrame.contains(key) && !eventsLastFrame.contains(key))
			return true;
		return false;
	}
	
	public static boolean isClicked(int key,int... mods){
		for(int mod : mods)
			if(!isPressed(mod))
				return false;
		return isClicked(key);
	}
	
	public static int getKeysDownCount(){
		return events.size();
	}
	
	public static ArrayList<Integer> getKeysDown(){
		return events;
	}
	
	public static ArrayList<String> getKeysDownByName(){
		ArrayList<String> names = new ArrayList<String>();
		for(Integer key: events){
			names.add(getKeyName(key));
		}
		return names;
	}
	
	public static String getKeyName(int key){
		for(Field field: Keyboard.class.getDeclaredFields()){
			try{
				if(Modifier.isStatic(field.getModifiers()) && field.getInt(null) == key)
					return field.getName();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return "Unknown key";
	}
	
	public static class Button{
		public int k = -1,ka = -1,n = -1,na = -1;
		
		public Button(int k){
			this.k = k;
		}
		
		public Button(int k, int n){
			this.k = k;
			this.n = n;
		}
		
		public Button(int k, int n, int ka, int na){
			this.k = k;
			this.n = n;
			this.ka = ka;
			this.na = na;
		}
		
		public float getValue(){
			boolean kb = isPressed(k);
			if(hasNegative()){
				boolean nb = isPressed(n);
				if(hasKeyAlt() && hasNegativeAlt()){
					boolean kab = isPressed(ka);
					boolean nab = isPressed(na);
					if((kb || kab) && !(nb || nab))
						return 1f;
					else if(!(kb || kab) && (nb || nab))
						return -1f;
					else
						return 0f;
				}else{
					if(kb && !nb)
						return 1f;
					else if(!kb && nb)
						return -1f;
					else
						return 0f;
				}
			}else{
				if(hasKeyAlt())
					return kb || isPressed(ka) ? 1 : 0;
				return kb ? 1 : 0;
			}
		}
		
		public boolean hasKey(){
			return k != -1;
		}
		
		public boolean hasKeyAlt(){
			return ka != -1;
		}
		
		public boolean hasNegative(){
			return n != -1;
		}
		
		public boolean hasNegativeAlt(){
			return na != -1;
		}
		
		public void release(){
			removeButton(this);
		}
	}
}
